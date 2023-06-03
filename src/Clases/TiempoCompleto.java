/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author mariogomez
 */
public class TiempoCompleto extends Trabajadores {
    
     @Override
    public double Salario(){
        if (getCargo() == "Gerente")
        {
            return 5000 + (1.5 * 400);
              }
        else{
            return 5000 + (1.5 * 250);
        }
    }

}