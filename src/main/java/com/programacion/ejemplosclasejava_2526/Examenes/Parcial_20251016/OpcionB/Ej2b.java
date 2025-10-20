package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251016.OpcionB;

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

        // Solicitar carga de CPU
        System.out.print("Introduce la carga de CPU (%): ");
        int carga = scanner.nextInt();

        // Evaluar el rango de carga
        if (carga < 0 || carga > 100) {
            System.out.println("Carga no valida");
        } else if (carga < 30) {
            System.out.println("Carga baja");
        } else if (carga < 60) {
            System.out.println("Carga moderada");
        } else {
            System.out.println("Carga alta");
        }
    }
    
}
