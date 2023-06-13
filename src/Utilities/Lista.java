package Clases.Utilities;

/*
* Crear la clase Lista<T> dentro del UML
* 
* */

public class Lista<T> {
    private int cantidadReal;
    private T[] elementos;

//    public Lista() {
//        cantidadReal = 0;
//        elementos = (T[]) new Object[cantidadMaxima];
//    }

    public Lista(int cantidadMax) {
        cantidadReal = 0;
        elementos = (T[]) new Object[cantidadMax];
    }

    // ADICIONAR
    public boolean Adicionar(T elemento) {
        elementos[cantidadReal++] = elemento;
        return true;
    }

    // ELIMINAR
    public boolean Eliminar(int posicion){
        for (int i = posicion; i < cantidadReal - 1; i++){
            // elementos[i] = elementos[i + 1]; // Sacado de la Conferencia
            elementos[i-1] = elementos[i];
            cantidadReal--;
        }
        return true;
    }

    // OBTENER
    public T Obtener(int posicion){
        return elementos[posicion-1];
    }

    // ACTUALIZAR
    public boolean Actualizar(int posicion, T elemento){
        elementos[posicion-1] = elemento;
        return true;
    }

    // Listar elementos
    public T[] ListarElementos(){
        for (int i = 0; i < cantidadReal; i++){
            return (T[]) elementos[i];
        }
        return null;
        /* Este return me lo pone automatico el IDE parece ser que es un hack para este lenguaje debido a que solo dentro del for no puede estar el return */
    }
}
