package Clases;

/*
* Crear la clase Lista<T> dentro del UML
* 
* */

import Excepciones.ListaLlena;

public class Lista<T> {
    private int cantidadReal;
    private int cantidadMaxima;
    private T[] elementos;

    public Lista(int cantidadMax) {
        this.cantidadReal = 0;
        this.cantidadMaxima = cantidadMax;
        this.elementos = (T[]) new Object[cantidadMax];
    }

    // ADICIONAR
    public boolean Adicionar(T elemento) throws ListaLlena {
        if (this.cantidadReal == this.cantidadMaxima) {
            throw new ListaLlena("La lista está llena");
        } else {
            elementos[cantidadReal++] = elemento;
            return true;
        }
    }

    // ELIMINAR
    public boolean Eliminar(int posicion) throws IndexOutOfBoundsException, NullPointerException{
        if (posicion > this.cantidadMaxima){
            throw new IndexOutOfBoundsException("La posición está fuera de rango");
        }
        else if (this.elementos[posicion] == null) {
            throw new NullPointerException("Posición vacía");
        } else {
            // Lógica sacada de la conferencia Genericidad, diapo 23 de 34
            for (int i = posicion; i < cantidadReal - 1; i++){
                elementos[i] = elementos[i + 1];
            }
            cantidadReal--;
            return true;
        }
    }

    // OBTENER
    public T Obtener(int posicion) throws IndexOutOfBoundsException, NullPointerException {
        if (posicion > this.cantidadMaxima) {
            throw new IndexOutOfBoundsException("La posición está fuera de rango");
        } else if (elementos[posicion] == null) {
            throw new NullPointerException("Posición vacía");
        } else {
        return elementos[posicion];
        }
    }

    // ACTUALIZAR
    public boolean Actualizar(int posicion, T elemento) throws ListaLlena {
        if(this.cantidadReal == this.cantidadMaxima)
            throw new ListaLlena("La lista está llena");
        if (posicion > this.cantidadMaxima)
            throw new IndexOutOfBoundsException("La posición está fuera de rango");
        else {
            this.cantidadReal++;
            for (int i = this.cantidadReal - 1; i > posicion; i--) {
                elementos[i] = elementos[i - 1];
            }
            elementos[posicion] = elemento;
        }
        return true;
    }
    
 /*   public boolean Actualizar(int posicion, T elemento) {
    if (posicion < 0 || posicion >= this.cantidadReal) {
        throw new IndexOutOfBoundsException("La posición está fuera de rango");
    }
    elementos[posicion] = elemento;
    return true;
}*/

    public int Longitud() {
        return this.cantidadReal;
    }

    public boolean isVacia() {
        return this.cantidadReal == 0;
    }
}
