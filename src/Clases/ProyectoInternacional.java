package Clases;

import java.util.Date;

import static Clases.Utilities.CantidadDeSemanas.ProyectoCantidadSemanasDuracion;

public class ProyectoInternacional extends Proyecto {

    // ATRIBUTOS
    private double costoDolar;
    private String nombrePais;

    // CONSTRUCTOR
    public ProyectoInternacional(String nombre, String descripcion, Date fechaInicio, Date fechaFin, double costoDolar, String nombrePais) {
        super(nombre, descripcion, fechaInicio, fechaFin);
        this.costoDolar = costoDolar;
        this.nombrePais = nombrePais;
    }

    public ProyectoInternacional(String nombre, String descripcion, Date fechaInicio, Date fechaFin, double costoAproximado, double costoDolar, String nombrePais) {
        super(nombre, descripcion, fechaInicio, fechaFin, costoAproximado);
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
    // Internacional (cantidad de semanas de duración * costo en dólares)
    public double ValorPorEsfuerzo(Date fechaInicio, Date fechaFin) {
        long semanasDeDuracion = ProyectoCantidadSemanasDuracion(fechaInicio,fechaFin);
        return semanasDeDuracion * this.getCostoDolar();
    }
}
