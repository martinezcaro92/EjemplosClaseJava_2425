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
        
        int aux1 [][] = {   {4,5,6,7,8,9},
                            {9,8,7,6,5,4},
                            {9,8,7,6,5,4},
                            {9,8,7,6,5,4},
                            {9,8,7,6,5,4},
                            {9,8,7,6,5,4}};
        
        int aux2 [][] = new int [3][3];
        
        double test [][] = {{0.1,0.2,0.3,0.4,0.5,0.6,0.7},
                            {0.7,0.6,0.5,0.4,0.7,0.2,0.1}};
        
        char var [][] = new char [7][4];
        
        /* RECORRIDO DE ARRAYS BIDIMENSIONALES
            Al igual que en en arrays unidimensionales se utiliza un bucle for para 
            recorrer todas las posiciones, dado que su dimensión es de (1,N); en un
            array bidimensional, se deben emplear dos bucles for para recorrer todas
            sus posiciones. Estos bucles for se encuentran anidados.
        
            for (int i = 0; i<var.length; i++){
                for (int j = 0; j<var[i].length; j++) {
                    // Cualquier acción que involucre a var[i][j]
                }
            }
        */
        //Definir y reservar memoria para un array de 3x2 llamado prueba, e imprimir
        // los indicadores de cada posición (no los valores de cada posición).
        int prueba [][] = new int [3][2];
        
//        for (int i = 0; i< prueba.length; i++)
//        {
//            for (int j = 0; j<prueba[i].length;j++)
//            {
//                System.out.println("[" + i + "][" + j + "]");
//            }
//        }
        /* Al utilizar la siguiente estructura, se permite imprimir valores o 
            posiciones que visualmente representan la posición que ocupan
        */

        for (int i = 0; i< prueba.length; i++)
        {
            for (int j = 0; j<prueba[i].length;j++)
            {
                System.out.print("[" + i + "][" + j + "]  ");
            }
            System.out.println("");
        }
        
        /* ENUNCIADO: Definir e inicializar una matriz (matx) de 4x4 que almacene 
            valores enteros. Imprimir el valor que se almacena en cada posición
            en forma de matriz.
        */
        int matx [][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,8,7,6},
                         {5,4,3,2}};
        
        for (int i = 0 ; i<matx.length; i++)
        {
            for (int j = 0; j<matx[i].length;j++)
            {
                System.out.print(matx[i][j] + " ");
            }
            System.out.println("");
        }
        
        /* ENUNCIADO: Se define una matriz que recoja las calificaciones enteras de diferentes
            estudiantes y módulos profesionales. Se trata de 5 estudiantes y 4 módulos 
            profesionales. Los datos deben introducirse por teclado, donde se pida la
            nota de un estudiante (j) y un módulo profesional (i).
            
            Una vez definidas todas  las calificaciones, debe imprimir un resumen 
            de las mismas.
        */
        
        
        
        
        
        
        
        
        
        
        /* ENUNCIADO: Realizar el juego de 3 en raya ('X', 'O') donde, utilizando
            una matriz de 3x3 se permita indicar coordenadas (fila y columna) para 
            reservar la posición a 'X' o 'O'. Si una posición ya ha sido previamente
            reservada, no se modifica y se pierde turno. Al finalizar cada iteración,
            se muestra todo el tablero añadiendo la última jugada.
        
        */
    }
    
}
