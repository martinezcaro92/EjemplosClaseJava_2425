/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_xxxxxx.UT2;

/**
 *
 * @author josem
 */
public class EjemploIfElse {
    public static void main (String [] args)
    {
        int nota = 6;
        
        if (nota >=9)
        {
            System.out.println("sobresaliente");
        } else if (nota >=7){
            System.out.println("notable");
        } else if (nota >=6){
            System.out.println("bien");
        } else if (nota >=5) {
            System.out.println("aprobado/suficiente");
        } else {
            System.out.println("suspenso");
        }    
    }
    
}
