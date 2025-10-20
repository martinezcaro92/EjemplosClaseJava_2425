/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Arrays;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Unidimensionales {

    /* DEFINCIÓN: Un array unidimensional es una estructura que permite almacenar
            varios datos de un mismo tipo. Algunos ejemplos prácticos son:
            - Notas de estudiantes en clase
            - Coste de la luz en un año
            - Ocupación por habitación
            
        Se deberá tener en cuenta:
            - La longitud del array --> La cantidad de datos que podemos almacenar
                - IMPORTANTE: NO SE PUEDE MODIFICAR LA CANTIDAD DE DATOS EN UN ARRAY
                    DESPUÉS DE SU DEFINICIÓN.
                - Se utilizará el método reservado .length para saber la longitud del
                    array.
            - La dimensión del array --> Al tratarse de un array unidimensional, un
                array tendrá SÓLO 1 fila y X columnas (1,X), donde X será la longitud
                del array.
    
        La definición de arrays en Java se realiza de la siguiente manera:
            - Declaración: 
                tipoVariable nombreVariable [];
            - Declaración y reserva de espacio:
                tipoVariable [] nombreVariable = new tipoVariable [X]; // X se sustituye por el número de posiciones
            - Declaración e inicialización:
                tipoVariable [] nombreVariable = {x, y , z}; // En este caso el array tiene longitud 3 y dimensión (1,3)
    */
    public static void main(String[] args) {
        // TODO code application logic her
        
        int notas [] = new int [29];
        double cost [];
        char pal [] = {'d','a','w','1',57};
        
        cost = new double [3];
        // cost = {1.2, 1.3, 1.4} NO ESTÁ PERMITIDO, DEBE REALIZARSE COMO SE 
        // MUESTRA A CONTINUACIÓN.
        cost [0] = 1.2;
        cost [1] = 1.3;
        cost [2] = 1.4;
        
        /* ACCESO A POSICIONES ESTÁTICAS DEL ARRAY*/
        System.out.println(pal[4]); //SE IMPRIME LA POSICIÓN 4 DEL ARRAY pal
        System.out.println(cost[1]); // SE IMPRIME LA POSICIÓN 1 DEL ARRAY cost
        
        /* ACCESO A TODAS LAS POSICIONES DEL ARRAY -- RECORRIDO CON BUCLE 
            Recordatorio bucle for:
                int arr [] = {3,7,1,2,3,4};
                for (int i = 0; i < arr.length;i++) //arr es el nombre de la variable
                {                                   //.length es el método que nos devuelve 
                    acciones_N;                     // la longitud dinámicamente
                }
        
        */
        
        /* ENUNCIADO: IMPRIMIR TODAS LAS POSICIONES DEL ARRAY cost */
        //int i;
        for (int i = 0; i<cost.length;i++)
        {
            System.out.println ("Valor de i: " + i);
            System.out.println(cost[i]);
        }
        
        /* ENUNCIADO: DEFINIR UN ARRAY notas2 con 5 posiciones que registre las 
            calificaciones de 5 estudiantes, muestre sus calificaciones por pantalla
            y obtenga la nota media de los 5 estudiantes
        */
        
        double notas2[] = new double[5];
        double suma = 0;
        double media = 0;
        Scanner scan = new Scanner (System.in);
        
        for (int i = 0; i<notas2.length; i++)
        {
            System.out.print ("Introduzca nota del alumno: ");
            notas2[i] = scan.nextDouble();
            suma += notas2[i];
        }
        media = suma/notas2.length;
        //System.out.println ("Las notas de los 5 alumnos son " + notas2[0]+ " " + notas2[1]+ " " + notas2[2]+ " " + notas2[3]+ " " + notas2[4]+ " ");
        for (int i = 0; i<notas2.length; i++)
        {
            System.out.println("La nota del estudiante " + (i+1) + " es: " + notas2[i]);
        } 
        System.out.println (" La media de estas notas es " + media);
        
        /* ENUNCIADO2: A partir del Array notas3 con 3 notas, tome los valores por pantalla,
            imprima los valores almacenados haciendo uso de un bucle while. 
                COMENTARIO: Vamos a aprender este recurso, pero la forma óptima
                    es con un bucle for
        */
        int notas3 [] = new int [3];
        int i = 0;
        
        while (i<notas3.length)
        {
            System.out.print("Introduzca la nota del estudiante: ");
            notas3[i] = scan.nextInt();
            i++;
        }
        System.out.println("");
        
        for (i=0;i<notas3.length;i++)
        {
            System.out.println("La nota del estudiante " + (i+1) + " es: " + notas3[i]);
        }
        
    }
    
}
