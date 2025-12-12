/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Repasos.previoRecuperacion;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class NotasEstudiantesArray {

    /**
     * @param args the command line arguments
     * Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
     * (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota
     * media, la nota más alta que ha sacado y la menor
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner (System.in);
        
        double notas [] = new double [5];
        double notaMax = 0;
        double notaMin = 10;
        double notaMedia = 0;
        double suma = 0;
        
        for (int i = 0; i<notas.length; i++) {
            System.out.print("Introduzca la nota del estudiante: ");
            double aux = scan.nextDouble();
            notas[i] = aux;
            
            suma += aux; // suma = suma + aux
            
            if (notas[i]>notaMax){
                notaMax = notas[i];
            }
            if (notas[i]<notaMin){
                notaMin = notas[i];
            }
        }
        notaMedia = suma / notas.length;
        
        System.out.println("La nota máx: " + notaMax);
        System.out.println("La nota min: " + notaMin);
        System.out.println("La nota media: " + notaMedia);

    }
    
}
