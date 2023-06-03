/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author mariogomez
 */
public class TiempParcial extends Trabajadores{
    double cantidadhorassemanales;

    public double getCantidadhorassemanales() {
        return cantidadhorassemanales;
    }

    public void setCantidadhorassemanales(double cantidadhorassemanales) {
        this.cantidadhorassemanales = cantidadhorassemanales;
    }
    
     @Override
    public double Salario(){
        if (getCargo() == "Asistente")
        {
            return 2500 + (getCantidadhorassemanales() * 200);
              }
        else{
            return 2500 + (getCantidadhorassemanales() * 150);
        }
    }
}
