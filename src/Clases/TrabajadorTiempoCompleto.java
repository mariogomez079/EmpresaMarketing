package Clases;

public class TrabajadorTiempoCompleto extends Trabajador {

    // ATRIBUTOS
    private String solapin;

    // CONSTRUCTOR
    
    public TrabajadorTiempoCompleto(){
    
    }
    
    public TrabajadorTiempoCompleto(String nombre, String email, String cargo, String solapin) {
        super(nombre, email, cargo);
        this.solapin = solapin;
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS
    
    public double getCantidadHorasSemanales() {
        return 0;
    }
    
    public  boolean isGraduado()
    {
     return false;
    }
    
    public String getSolapin() {
        return solapin;
    }
     
    public void setSolapin(String solapin) {
        this.solapin = solapin;
    }

    // IMPLEMENTACION DE METODOS

    @Override
    // Mètodo virtual
    // Salario base de los trabajadores a tiemplo completo es 5000.00
    public double CalcularSalario() {
        double salarioBase = super.CalcularSalario(); // 3000.00 (Trabajador)

        // Para los empleados a tiempo completo se calcula como: (salario base + 5000$) + (1.5 * índice según el cargo)
        return (salarioBase + 5000.00) + CalcularIndice();
    }

    private double CalcularIndice(){
        double cargoGerente = 400.00;
        double otrosCargos = 250.00;

        // El índice toma un valor de 400 para los cargos de gerente y 250 para los demás cargos
        if (super.getCargo().equals("gerente")){
            return 1.5 * cargoGerente;
        } else {
            return 1.5 * otrosCargos;
        }
    }
}
