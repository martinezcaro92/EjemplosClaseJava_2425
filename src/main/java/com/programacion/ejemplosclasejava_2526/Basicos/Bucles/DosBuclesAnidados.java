/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Basicos.Bucles;

/**
 *
 * @author user
 */
public class DosBuclesAnidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i=1; i<=5; i++) // Va a expresar las tablas del 1, 2, 3, 4 y 5
        {
            System.out.println("Tabla del " + i);
            for (int j=0; j<=10;j++)
            {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
    
}
