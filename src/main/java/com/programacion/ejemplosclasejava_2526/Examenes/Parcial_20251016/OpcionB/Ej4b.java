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
public class Ej4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero entre 10 y 50: ");
        int numero = scanner.nextInt();

        if (numero < 10 || numero > 50) {
            System.out.println("Numero no válido");
        } else {
            int i = 1;
            System.out.print("Divisores: ");
            while (i < numero) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println(); // Para salto de línea al final
        }
    }
    
}
