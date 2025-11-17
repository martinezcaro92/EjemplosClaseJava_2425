/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251113;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15]; // Array para almacenar los 15 números
        int pares = 0;
        int impares = 0;

        // Leer los números y contar pares/impares en un solo ciclo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número: " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
    
}
