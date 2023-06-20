package Clases;

import Excepciones.ListaLlena;

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
    public boolean AdicionarTrabajador(Trabajador trabajador1) throws ListaLlena {
        return trabajadores.Adicionar(trabajador1);
    }

    public boolean AdicionarProyecto(Proyecto proyecto1) throws ListaLlena {
        return proyectos.Adicionar(proyecto1);
    }

    // ELIMINAR
    public boolean EliminarTrabajador(int posicion) throws IndexOutOfBoundsException, NullPointerException{
        return trabajadores.Eliminar(posicion);
    }

    public boolean EliminarProyecto(int posicion) throws IndexOutOfBoundsException, NullPointerException{
        return proyectos.Eliminar(posicion);
    }

    // OBTENER
    public Trabajador ObtenerTrabajador(int posicion) throws IndexOutOfBoundsException, NullPointerException{
        return trabajadores.Obtener(posicion);
    }

    public Proyecto ObtenerProyecto(int posicion) throws IndexOutOfBoundsException, NullPointerException{
        return proyectos.Obtener(posicion);
    }

    // ACTUALIZAR
    public boolean ActualizarTrabajador(int posicion, Trabajador trabajador1) throws ListaLlena {
        return trabajadores.Actualizar(posicion, trabajador1);
    }

    public boolean ActualizarProyecto(int posicion, Proyecto proyecto1) throws ListaLlena {
        return proyectos.Actualizar(posicion, proyecto1);
    }

    public int LongitudTrabajador(){
        return trabajadores.Longitud();
    }

    public int LongitudProyecto(){
        return proyectos.Longitud();
    }

    public boolean ProyectoVacio(){
        return proyectos.isVacia();
    }

    public boolean TrabajadorVacio(){
        return trabajadores.isVacia();
    }

    // IMPLEMENTACION DE SETTERS Y GETTERS

    // IMPLEMENTACION DE METODOS
}
