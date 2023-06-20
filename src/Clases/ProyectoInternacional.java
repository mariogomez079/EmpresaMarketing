package Clases;

import java.util.Date;

//import static Clases.Utilities.CantidadDeSemanas.ProyectoCantidadSemanasDuracion;

public class ProyectoInternacional extends Proyecto {

    // ATRIBUTOS
    private double costoDolar;
    private String nombrePais;

    // CONSTRUCTOR
    public ProyectoInternacional(String nombre, String descripcion, double semanasDuracion) {
        super(nombre, descripcion, semanasDuracion);
    }

    public ProyectoInternacional(String nombre, String descripcion, double semanasDuracion, double costoDolar) {
        super(nombre, descripcion, semanasDuracion);
        this.costoDolar = costoDolar;
    }

    public ProyectoInternacional(String nombre, String descripcion, double semanasDuracion, String nombrePais) {
        super(nombre, descripcion, semanasDuracion);
        this.nombrePais = nombrePais;
    }

    public ProyectoInternacional(String nombre, String descripcion, double semanasDuracion, double costoDolar, String nombrePais) {
        super(nombre, descripcion, semanasDuracion);
        this.costoDolar = costoDolar;
        this.nombrePais = nombrePais;
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS
    public double getCostoDolar() {
        return costoDolar;
    }

    public void setCostoDolar(double costoDolar) {
        this.costoDolar = costoDolar;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    // IMPLEMENTACION DE METODOS
    @Override
    public double CalcularCostoProyecto() {
        // El coste del proyecto internacional se calcula como [cantidad de semanas de duración * costo en dólares] y por tanto es (coste + el 15% del coste) * 7.25
        return (CalcularCosto() + (CalcularCosto() * 0.15)) * 7.25;
    }

    private double CalcularCosto(){
        return super.getSemanasDuracion() * this.getCostoDolar();
    }
}
