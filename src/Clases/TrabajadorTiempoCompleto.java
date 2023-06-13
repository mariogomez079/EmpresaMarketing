package Clases;

public class TrabajadorTiempoCompleto extends Trabajador {

    // ATRIBUTOS

    // CONSTRUCTOR
    public TrabajadorTiempoCompleto(String nombre, String email, String cargo) {
        super(nombre, email, cargo);
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS

    // IMPLEMENTACION DE METODOS

    @Override
    // Mètodo virtual
    // Salario base de los trabajadores a tiemplo completo es 5000.00
    public double CalcularSalario() {
        double salarioBase = super.CalcularSalario() + 2000.00; // 3000.00 (Trabajador) + 2000.00 (Tiempo Completo)
        double cargoGerente = 400.00;
        double otrosCargos = 250.00;

        // 5000 + (1.5 * índice según el cargo)
        // El índice toma un valor de 400 para los cargos de gerente y 250 para los demás cargos

        if (super.getCargo().equals("gerente")){
            return salarioBase + (1.5 * cargoGerente);
        } else {
            return salarioBase + (1.5 * otrosCargos);
        }
    }
}
