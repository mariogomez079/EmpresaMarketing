package Clases;

public abstract class Trabajador {

    // ATRIBUTOS
    private String nombre;
    private String email;
    private String cargo;

    // CONSTRUCTOR
    
    public Trabajador(){
    
    }
    
    
    public Trabajador(String nombre, String email, String cargo) {
        this.nombre = nombre;
        this.email = email;
        this.cargo = cargo;
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public abstract String getSolapin();
    public abstract double getCantidadHorasSemanales();
    public abstract boolean isGraduado();
    public abstract void setSolapin(String solapin);
    public abstract void setCantidadHorasSemanales(double cantidadHorasSemanales);
     public abstract void setGraduado(boolean graduado);

    // IMPLEMENTACION DE METODOS

    // Salario base de todos los trabajadores es 3000.00$ sin contar los NO Graduados
    public double CalcularSalario(){
        return 3000.00;
    }
}
