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
public class Ej3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        int numero, suma = 0, contador = 0;
        double promedio;

        do {
            System.out.print("Introduce un número entre 1 y 5: ");
            numero = scanner.nextInt();

            if (numero >= 1 && numero <= 5) {
                suma += numero;
                contador++;
            } else {
                System.out.println("Número fuera de rango. Intente nuevamente.");
            }

        } while (suma < 100);

        promedio = (double) suma / contador;

        System.out.println("Suma total acumulada: " + suma);
        System.out.println("Número de iteraciones válidas: " + contador);
        System.out.println("Promedio de los números introducidos: " + promedio);
    }
    
}
