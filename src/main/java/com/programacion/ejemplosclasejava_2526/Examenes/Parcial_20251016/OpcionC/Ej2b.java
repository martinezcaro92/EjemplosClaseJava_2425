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
public class Ej2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el peso del paquete en kilos: ");
        double peso = scanner.nextDouble();

        if (peso < 0) {
            System.out.println("Peso no válido");
        } else if (peso < 1) {
            System.out.println("Ligero");
        } else if (peso <= 5) {
            System.out.println("Moderado");
        } else {
            System.out.println("Pesado");
        }

    }
    
}
