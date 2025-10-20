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
public class Ej4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 10 y 50: ");
        int numero = scanner.nextInt();

        if (numero < 10 || numero > 50) {
            System.out.println("Número no válido");
        } else {
            System.out.print("Divisores: ");
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Salto de línea al final
        }
    }
}
