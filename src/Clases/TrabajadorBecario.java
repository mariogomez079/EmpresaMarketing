package Clases;

public class TrabajadorBecario extends Trabajador {

    // ATRIBUTOS
    boolean graduado;

    // CONSTRUCTOR
    
    public TrabajadorBecario() {
 
    }
    
    public TrabajadorBecario(String nombre, String email, String cargo, boolean graduado) {
        super(nombre, email, cargo);
        this.graduado = graduado;
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS
    public boolean isGraduado() {
        return graduado;
    }

    public void setGraduado(boolean graduado) {
        this.graduado = graduado;
    }

    // IMPLEMENTACION DE METODOS
    @Override
    // Mètodo virtual
    public double CalcularSalario(){
        if(isGraduado()) {
            return super.CalcularSalario();
        }
        else {
            return 1500.00;
        }
    }
}
