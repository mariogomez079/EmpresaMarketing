package Clases;

public abstract class Proyecto {

    // ATRIBUTOS
    protected String nombre;
    protected String descripcion;
    protected double semanasDuracion;

    // CONSTRUCTOR
    
    
    public Proyecto(String nombre, String descripcion, double semanasDuracion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.semanasDuracion = semanasDuracion;
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSemanasDuracion() {
        return semanasDuracion;
    }

    public void setSemanasDuracion(double semanasDuracion) {
        this.semanasDuracion = semanasDuracion;
    }

    // IMPLEMENTACION DE METODOS
    public abstract double CalcularCostoProyecto();
    public abstract String CalcularRendimiento();
    public abstract double getCostoPesos();
    public abstract String getNombrePais();
    public abstract double getCostoDolar();
    
}
