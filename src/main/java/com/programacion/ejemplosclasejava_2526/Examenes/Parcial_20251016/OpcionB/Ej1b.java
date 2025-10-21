/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251016.OpcionB;

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
        // Solicitar la temperatura en Celsius
        System.out.print("Introduce la temperatura en grados Celsius: ");
        int celsius = scanner.nextInt();
        double temperatura;
       

        // Mostrar menú de opciones
        System.out.println("Elige una opción de conversión:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Rankine");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        // Usar switch-case para procesar la conversión
        switch (opcion) {
            case 1:
                temperatura = (double)(celsius * 9 / 5) + 32;
                System.out.println("Resultado: " + temperatura + " Fahrenheit");
                break;

            case 2:
                temperatura = (double) celsius + 273.15;
                System.out.println("Resultado: " + temperatura + " Kelvin");
                break;

            case 3:
                temperatura = (double) (celsius + 273.15) * 9 / 5;
                System.out.println("Resultado: " + temperatura + " Rankine");
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }

    }
    
}
