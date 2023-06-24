package Clases;

public class TrabajadorTiempoParcial extends Trabajador implements IRendimiento {

    // ATRIBUTOS
    private double cantidadHorasSemanales;
    private boolean graduado;

    // CONSTRUCTOR
    public TrabajadorTiempoParcial(String nombre, String email, String cargo, double cantidadHorasSemanales, boolean graduado) {
        super(nombre, email, cargo);
        this.cantidadHorasSemanales = cantidadHorasSemanales;
        this.graduado = graduado;
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS
    
    public String getSolapin() {
        return null;
    }
    
    public void setSolapin(String solapin) {
       
    }
    
    public double getCantidadHorasSemanales() {
        return cantidadHorasSemanales;
    }

    public void setCantidadHorasSemanales(double cantidadHorasSemanales) {
        this.cantidadHorasSemanales = cantidadHorasSemanales;
    }

    public boolean isGraduado() {
        return graduado;
    }

    public void setGraduado(boolean graduado) {
        this.graduado = graduado;
    }

    // IMPLEMENTACION DE METODOS
    @Override
    // Mètodo virtual
    public double CalcularSalario() {
        double salarioBase = CalcularSalarioBase();
        double indiceCargo = CalcularIndice();

        // Para los empleados a tiempo parcial: salario base + (1.5 * cantidad de horas trabajadas por semana) + índice según el cargo.
        return salarioBase + (1.5 * this.getCantidadHorasSemanales()) + indiceCargo;
    }

    private double CalcularSalarioBase(){
        // La empresa tiene un salario base de 1500 pesos para los no graduados y 3000 pesos para el resto de trabajadores en ambas modalidades.
        if (this.isGraduado()){
            return super.CalcularSalario();
        } else {
            return 1500.00;
        }
    }

    private double CalcularIndice(){
        // El índice toma un valor de 200 para los cargos de asistente y 150 para los demás cargos.
        if (super.getCargo().equals("asistente")){
            return 200.00;
        } else {
            return 150.00;
        }
    }

    @Override
    public String CalcularRendimiento() {
        double cantidadHoras = this.getCantidadHorasSemanales();

        if (!this.isGraduado()){
            if (cantidadHoras > 10 && cantidadHoras < 14){
                return "Muy Bien";
            } else if (cantidadHoras > 6 && cantidadHoras < 9){
                return  "Bien";
            } else if (cantidadHoras > 2 && cantidadHoras < 5){
                return "Regular";
            } else {
                return "Mal";
            }
        }else {
        return null;}
    }
}
