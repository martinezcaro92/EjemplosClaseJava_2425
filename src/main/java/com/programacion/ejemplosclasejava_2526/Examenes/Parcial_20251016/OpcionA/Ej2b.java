package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251016.OpcionA;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class Ej2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad
        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();

        // Clasificación usando if / else
        if (edad < 0) {
            System.out.println("Edad no válida");
        } else if (edad <= 17) {
            System.out.println("Menor de edad");
        } else if (edad <= 64) {
            System.out.println("Adulto");
        } else {
            System.out.println("Jubilado");
        }
    }
    
}
