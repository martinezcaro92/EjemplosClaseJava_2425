/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251113;

/**
 *
 * @author user
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 🔹 Matriz original de tráfico (en Gbps)
        double[][] trafico = {
            {0,   0.5, 8.9},
            {7.5, 0,   6.7},
            {4.2, 5.5, 0}
        };

        // ====================================================================
        // Apartado a) Crear la matriz de validación (valores > 5 Gbps)
        // ====================================================================
        boolean[][] validacion = new boolean[3][3];

        for (int i = 0; i < trafico.length; i++) {
            for (int j = 0; j < trafico[i].length; j++) {
                if (trafico[i][j] > 5) {
                    validacion[i][j] = true;
                } else {
                    validacion[i][j] = false;
                }
            }
        }

        // Mostrar la matriz de validación
        System.out.println("a) Matriz de validación (true = tráfico > 5 Gbps):");
        for (int i = 0; i < validacion.length; i++) {
            for (int j = 0; j < validacion[i].length; j++) {
                System.out.print(validacion[i][j] + "\t");
            }
            System.out.println();
        }

        // ====================================================================
        // Apartado b) Calcular la suma del tráfico total > 5 Gbps
        // ====================================================================
        double sumaTotal = 0;

        for (int i = 0; i < trafico.length; i++) {
            for (int j = 0; j < trafico[i].length; j++) {
                // Solo sumamos si en la matriz de validación hay un "true"
                if (validacion[i][j] == true) {
                    sumaTotal += trafico[i][j];
                }
            }
        }

        System.out.println("\nb) Suma total del tráfico > 5 Gbps: " + sumaTotal + " Gbps");
    }
    
}
