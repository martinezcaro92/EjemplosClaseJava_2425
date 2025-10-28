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
                tipoVariable [][] nombreVariable = {{x,y,z},{a,b,c}}; // En este caso el array tiene dimensión (2,3)
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
            recorrer todas las posiciones, dado que su dimensión es de (N,M); en un
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
        
        
        Scanner scan = new Scanner(System.in);

        int notas2[][] = new int [4][5];

        for(int i = 0; i<notas2.length; i++){
            for(int j = 0; j<notas2[i].length; j++){
                System.out.print("Nota del estudiante " + (i+1) + " en la materia "+ (j+1) + ":" );
                notas2[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i<notas2.length; i++){
            for(int j = 0; j<notas2[i].length; j++){
                System.out.print(notas2[i][j] + " ");
            }
            System.out.println("");
        }
        
        /* ENUNCIADO: Realizar el juego de 3 en raya ('X', 'O') donde, utilizando
            una matriz de 3x3 se permita indicar coordenadas (fila y columna) para 
            reservar la posición a 'X' o 'O'. Si una posición ya ha sido previamente
            reservada, no se modifica y se pierde turno. Al finalizar cada iteración,
            se muestra todo el tablero añadiendo la última jugada.
        
            Pista: Emplear un sólo bucle for para guardar los datos y utilizar el método
                de doble bucle for para imprimir el estado de la partida. Se debe pedir
                la coordenada donde guardar la información. Se alternarán 'X' y 'O' para
                iteraciones pares e impares respectivamente. Sale el jugador con 'X';
        */
        
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[3][3]; // matriz del juego 3x3
        
        // Inicializar el tablero con espacios vacíos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }

        System.out.println("=== JUEGO DEL 3 EN RAYA ===");
        System.out.println("Coordenadas válidas: filas y columnas del 0 al 2");
        char jugador;
        // Bucle principal: máximo 9 jugadas
        for (int turno = 0; turno < 9; turno++) {
            if (turno % 2 == 0)
            {
                jugador = 'X';
            } else {
                jugador = 'O';
            }
            System.out.println("Turno del jugador " + jugador);

            // Solicitar coordenadas
            System.out.print("Introduce fila (0-2): ");
            int fila = sc.nextInt();
            System.out.print("Introduce columna (0-2): ");
            int columna = sc.nextInt();

            // Comprobación de validez
            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Coordenadas fuera del rango. Pierdes el turno.");
            } else if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
                System.out.println("Casilla ya ocupada. Pierdes el turno.");
            } else {
                tablero[fila][columna] = jugador; // jugada válida
            }
            
//            MÉTODO ALTERNATIVO DE ASIGNACIÓN DE POSICIONES A UN JUGADOR POR TURNO
//            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
//                System.out.println("Coordenadas fuera del rango. Pierdes el turno.");
//            } else if (tablero[fila][columna] == '-') {
//                tablero[fila][columna] = jugador; // jugada válida
//            } else {
//                System.out.println("Casilla ya ocupada. Pierdes el turno.");
//            }
            

            // Mostrar el tablero actualizado
            System.out.println("Estado actual del tablero:");
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Partida finalizada. ¡Gracias por jugar!");
        sc.close();
    }
    /* ENUNCIADO DE MEJORA: Buscar cómo definir una condición de parada cuando
        un jugador realice un tres en raya en el tablero de jugada.
    */
}
