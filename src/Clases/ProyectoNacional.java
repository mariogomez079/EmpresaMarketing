package Clases;

import java.util.Date;

import static Clases.Utilities.CantidadDeSemanas.ProyectoCantidadSemanasDuracion;

public class ProyectoNacional extends Proyecto {

    // ATRIBUTOS
    private double costoPesos;

    // CONSTRUCTOR
    public ProyectoNacional(String nombre, String descripcion, Date fechaInicio, Date fechaFin, double costoPesos) {
        super(nombre, descripcion, fechaInicio, fechaFin);
        this.costoPesos = costoPesos;
    }

    public ProyectoNacional(String nombre, String descripcion, Date fechaInicio, Date fechaFin, double costoAproximado, double costoPesos) {
        super(nombre, descripcion, fechaInicio, fechaFin, costoAproximado);
        this.costoPesos = costoPesos;
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS
    public double getCostoPesos() {
        return costoPesos;
    }

    public void setCostoPesos(double costoPesos) {
        this.costoPesos = costoPesos;
    }

    // IMPLEMENTACION DE METODOS

    @Override
    // Nacional (cantidad de semanas de duración * costo en pesos mexicanos) / 0.5
    public double ValorPorEsfuerzo(Date fechaInicio, Date fechaFin) {
        long semanasDeDuracion = ProyectoCantidadSemanasDuracion(fechaInicio,fechaFin);
        return (semanasDeDuracion * this.getCostoPesos()) / 0.5;
    }
}