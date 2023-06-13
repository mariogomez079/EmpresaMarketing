package Clases;

import Clases.Utilities.Lista;

import java.util.Date;

public abstract class Proyecto {

    // ATRIBUTOS
    protected String nombre;
    protected String descripcion;
    protected Date fechaInicio;
    protected Date fechaFin;

    Lista<Factura> facturas;

    private double costoReal;
    private double costoAproximado;

    // CONSTRUCTOR
    public Proyecto(String nombre, String descripcion, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Proyecto(String nombre, String descripcion, Date fechaInicio, Date fechaFin, double costoAproximado){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

        this.costoReal = 0.0;
        this.costoAproximado = costoAproximado;

    }

    // ADICIONAR Factura
    public boolean AdicionarFactura(Factura factura1){
        return facturas.Adicionar(factura1);
    }

    // ELIMINAR Factura
    public boolean EliminarFactura(int posicion){
        return facturas.Eliminar(posicion);
    }

    // OBTENER Factura
    public Factura ObtenerFactura(int posicion){
        return facturas.Obtener(posicion);
    }

    // ACTUALIZAR Factura
    public boolean ActualizarFactura(int posicion, Factura factura1){
        return facturas.Actualizar(posicion, factura1);
    }

    // Listar Factura
    public Factura[] ListarFacturas(){
        return facturas.ListarElementos();
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    // IMPLEMENTACION DE METODOS
    public abstract double ValorPorEsfuerzo(Date fechaInicio, Date fechaFin);

//    public abstract double CalidadProyecto();
}
