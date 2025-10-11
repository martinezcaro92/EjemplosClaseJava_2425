/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.UT2;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Media10EstudiantesArray {
    public static void main(String[] args) {
        int notas [] = new int [10];
        Scanner scan = new Scanner (System.in);
        
        int suma = 0;
        double media = 0;
        
        // toma las notas introducidas por teclado
        for (int i=0; i<notas.length; i++)
        {
            System.out.print("Introduzca nota " + i + ": ");
            notas[i] = scan.nextInt();
        }
        
        // realiza la media de las notas previamente introducidas
        for (int i =0; i<notas.length; i++)
        {
            suma += notas[i]; 
        }
        media = (double) suma/notas.length;
        System.out.println("La media de la clase es: " + media); 
    }
}
