/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251016.OpcionC;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ej1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce la distancia en metros: ");
        double metros = scanner.nextDouble();

        // Menú
        System.out.println("Elige una opción de conversión:");
        System.out.println("1. Pulgadas");
        System.out.println("2. Yardas");
        System.out.println("3. Pies");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        // Conversión con switch-case
        switch (opcion) {
            case 1:
                double pulgadas = metros * 39.37;
                System.out.println("Resultado: "+ pulgadas+" pulgadas");
                break;
            case 2:
                double yardas = metros * 1.09361;
                System.out.println("Resultado: " + yardas + " yardas");
                break;
            case 3:
                double pies = metros * 3.28084;
                System.out.println("Resultado: " + pies + " pies");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    
}
