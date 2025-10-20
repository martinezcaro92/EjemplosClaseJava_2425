/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Arrays;

/**
 *
 * @author josem
 */
public class Bidimensionales {

    /* DEFINCIÓN: Un array bidimensional es una estructura que permite almacenar
            varios datos (con filas y columnas) de un mismo tipo. Algunos ejemplos prácticos son:
            - Un instituto tiene varias clases, y cada clase varios estudiantes
            - Numeración de las butacas de un cine
            - Matrices de tráfico de una red de telecomunicaciones
            
        Se deberá tener en cuenta:
            - La dimensión del array --> Al tratarse de un array bidimensional, un
                array tendrá X filas e Y columnas (X,Y).
    
        La definición de arrays bidimensionales en Java se realiza de la siguiente manera:
            - Declaración: 
                tipoVariable nombreVariable [][];
            - Declaración y reserva de espacio:
                tipoVariable [][] nombreVariable = new tipoVariable [X][Y]; // X se sustituye por el número de filas
                                                                            // Y se sustituye por el número de columnas
            - Declaración e inicialización:
                tipoVariable [] nombreVariable = {{x,y,z},{a,b,c}}; // En este caso el array tiene dimensión (2,3)
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int notas [][];
        double [][] matriz = new double[4][5];
        char hello [][] = {{'h','e','l','l','o'},{'a','m','i','g','@'}};
        
        /* ENUNCIADOS: Definir los arrays bidimensionales que cumplan con:
            - aux1 con (6x6) de tipo entero --> Declaración e inicialización
            - aux2 con (3x3) de tipo entero --> Declaración y reserva de espacio
            - test con (2x7) de tipo double --> Declaración e inicialización
            - var con (7x4) de tipo char --> Declaración y reserva de espacio
        */
        
    }
    
}
