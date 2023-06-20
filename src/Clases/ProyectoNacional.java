package Clases;

public class ProyectoNacional extends Proyecto implements IRendimiento {

    // ATRIBUTOS
    private double costoPesos;

    // CONSTRUCTOR
    public ProyectoNacional(String nombre, String descripcion, double semanasDuracion) {
        super(nombre, descripcion, semanasDuracion);
    }

    public ProyectoNacional(String nombre, String descripcion, double semanasDuracion, double costoPesos) {
        super(nombre, descripcion, semanasDuracion);
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
    public double CalcularCostoProyecto() {
        // El coste del proyecto nacional se calcula como [cantidad de semanas de duración * costo en pesos mexicanos] y por tanto es (coste + el 10% de coste) * 7.25
        return (CalcularCosto() + (CalcularCosto() * 0.10)) * 7.25;
    }

    private double CalcularCosto(){
        return super.getSemanasDuracion() * this.getCostoPesos();
    }

    @Override
    public String CalcularRendimiento() {
        if ((CalcularCostoProyecto() * this.getSemanasDuracion()) < 50000.00){
            return "Bien";
        } else if (((CalcularCostoProyecto() * this.getSemanasDuracion()) > 50000.00) && ((CalcularCostoProyecto() * this.getSemanasDuracion()) < 100000.00)){
            return "Regular";
        } else {
            return "Mal";
        }
    }
}