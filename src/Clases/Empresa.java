package Clases;

import Clases.Utilities.Lista;

public class Empresa {

    // ATRIBUTOS
    Lista<Trabajador> trabajadores;
    Lista<Proyecto> proyectos;

    // CONSTRUCTOR
    public Empresa(int cantidadMaxTrabajadores, int cantidadMaxProyectos) {
        this.trabajadores = new Lista<Trabajador>(cantidadMaxTrabajadores);
        this.proyectos = new Lista<Proyecto>(cantidadMaxProyectos);
    }

    // ADICIONAR
    public boolean AdicionarTrabajador(Trabajador trabajador1){
        return trabajadores.Adicionar(trabajador1);
    }

    public boolean AdicionarProyecto(Proyecto proyecto1){
        return proyectos.Adicionar(proyecto1);
    }

    // ELIMINAR
    public boolean EliminarTrabajador(int posicion){
        return trabajadores.Eliminar(posicion);
    }

    public boolean EliminarProyecto(int posicion){
        return proyectos.Eliminar(posicion);
    }

    // OBTENER
    public Trabajador ObtenerTrabajador(int posicion){
        return trabajadores.Obtener(posicion);
    }

    public Proyecto ObtenerProyecto(int posicion){
        return proyectos.Obtener(posicion);
    }

    // ACTUALIZAR
    public boolean ActualizarTrabajador(int posicion, Trabajador trabajador1){
        return trabajadores.Actualizar(posicion, trabajador1);
    }

    public boolean ActualizarProyecto(int posicion, Proyecto proyecto1){
        return proyectos.Actualizar(posicion, proyecto1);
    }

    // Listar
    public Trabajador[] ListarTrabajadores(){
        return trabajadores.ListarElementos();
    }

    public Proyecto[] ListarProyectos(){
        return proyectos.ListarElementos();
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS

    // IMPLEMENTACION DE METODOS
//    public String Evaluacion(){
//
//    }
}
