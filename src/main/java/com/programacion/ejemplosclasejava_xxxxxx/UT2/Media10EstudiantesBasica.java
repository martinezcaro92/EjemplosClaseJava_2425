/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_xxxxxx.UT2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Media10EstudiantesBasica {
    public static void main(String[] args) {
        // Declaraciones e inicializaciones.
        Scanner scan = new Scanner (System.in);
        int total = 0; // suma de notas
        int contador; // contador de notas
        int nota; // valor de la nota
        double media; // media de todas las notas
        // Inicialización variable de control del bucle.
        contador = 0;
        // Petición de notas y cálculo de suma de notas.
        while (contador < 10){
            // Pedir nota y leerla.
            System.out.print("Introduzca nota: ");
            nota = scan.nextInt();
            // Incrementar el total.
            total += nota;
            // Incrementar variable de control.
            contador++;
        }
        // Cálculo de la media.
        media = (double) total / contador;
        // Muestra del valor de la media.
        System.out.println("La media de la clase es: " + media); 
    }
}
