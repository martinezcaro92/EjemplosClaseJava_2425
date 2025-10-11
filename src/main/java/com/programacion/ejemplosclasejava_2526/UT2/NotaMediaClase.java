/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.UT2;

/**
 *
 * @author josem
 */
public class NotaMediaClase {
    public static void main(String[] args) {
        int suma = 0;
        double media = 0;
        
        int [] notas = {5,8,6,9,1,2,5,7,9,5,3,5,5};
        for (int i =0; i<notas.length;i++)
        {
            suma +=notas[i];
        }
        media = (double) suma/notas.length;
        System.out.println("La nota media es: " + media);
    }
}
