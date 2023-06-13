package Clases;

/**
 * Cambiar el UML para que la clase Trabajador no se represente abstracta
 *
 * */
public class Trabajador {

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

    // IMPLEMENTACION DE METODOS

    // Salario base de todos los trabajadores es 3000.00
    public double CalcularSalario(){
        return 3000.00;
    }
}
