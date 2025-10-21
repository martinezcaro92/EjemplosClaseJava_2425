/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251016.OpcionA;

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
        Scanner scanner = new Scanner(System.in);

        // Solicitar la distancia en metros
        System.out.print("Introduce la distancia en metros: ");
        int metros = scanner.nextInt();
        double distancia;

        // Mostrar menú de opciones
        System.out.println("Elige una opción de conversion:");
        System.out.println("1. Centimetros");
        System.out.println("2. Milimetros");
        System.out.println("3. Kilometros");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        // Usar switch-case para las conversiones
        switch (opcion) {
            case 1:
                distancia = (double) metros * 100;
                System.out.println("Resultado: " + distancia + " centimetros");
                break;

            case 2:
                distancia = (double) metros * 1000;
                System.out.println("Resultado: " + distancia + " milimetros");
                break;

            case 3:
                distancia = (double) metros / 1000;
                System.out.println("Resultado: " + distancia + " kilometros");
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }

    }
    
}
