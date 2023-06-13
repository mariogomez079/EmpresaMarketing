package Clases;

public class TrabajadorTiempoParcial extends Trabajador {

    // ATRIBUTOS
    private double cantidadHorasSemanales;

    // CONSTRUCTOR
    public TrabajadorTiempoParcial(String nombre, String email, String cargo, double cantidadHorasSemanales) {
        super(nombre, email, cargo);
        this.cantidadHorasSemanales = cantidadHorasSemanales;
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS
    public double getCantidadHorasSemanales() {
        return cantidadHorasSemanales;
    }

    public void setCantidadHorasSemanales(double cantidadHorasSemanales) {
        this.cantidadHorasSemanales = cantidadHorasSemanales;
    }

    // IMPLEMENTACION DE METODOS
    @Override
    // Mètodo virtual
    public double CalcularSalario() {
        double salarioBase = super.CalcularSalario() - 500.00;
        int cargoAsistente = 200;
        int otrosCargos = 150;

        // Salario base de todos los trabajadores a tiempo parcial es 2500.00
        // 2500 * cantidad de horas trabajadas por semana * índice según el cargo.
        // Para empleados a tiempo parcial: El índice toma un valor de 200 para los cargos de asistente y 150 para los demás cargos.

        if (super.getCargo().equals("asistente")){
            return salarioBase * this.getCantidadHorasSemanales() * cargoAsistente;
        } else {
            return salarioBase * this.getCantidadHorasSemanales() * otrosCargos;
        }
    }
}
