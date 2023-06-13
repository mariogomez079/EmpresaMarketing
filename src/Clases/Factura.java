package Clases;

public class Factura {

    // ATRIBUTOS
    private String id;
    private double costoReal;

    // CONSTRUCTOR
    public Factura(String identificador, double costoReal) {
        this.id = identificador;
        this.costoReal = costoReal;
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCostoReal() {
        return costoReal;
    }

    public void setCostoReal(double costoReal) {
        this.costoReal = costoReal;
    }

    // IMPLEMENTACION DE METODOS
}