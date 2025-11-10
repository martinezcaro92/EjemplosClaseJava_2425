/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Repasos.PrevUT3;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class TresEnRaya {

    /**
     * ENUNCIADO: Realizar el juego de 3 en raya ('X', 'O') donde, utilizando
       una matriz de 3x3 se permita indicar coordenadas (fila y columna) para 
       reservar la posición a 'X' o 'O'. Si una posición ya ha sido previamente
       reservada, no se modifica y se pierde turno. Al finalizar cada iteración,
       se muestra todo el tablero añadiendo la última jugada.
        
       Pista: Emplear un sólo bucle for para guardar los datos y utilizar el método
       de doble bucle for para imprimir el estado de la partida. Se debe pedir
       la coordenada donde guardar la información. Se alternarán 'X' y 'O' para
       iteraciones pares e impares respectivamente. Sale el jugador con 'X';
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new  Scanner (System.in);
        char [][] tablero = new char [3][3];
        
        for (int i = 0; i<tablero.length; i++)
        {
            for (int j = 0; j<tablero[i].length;j++)
            {
                tablero[i][j] = '-';
            }
        }
        System.out.println("Juego del 3 en raya");
        char jugador = '-';
        for (int turno = 0; turno<9; turno++)
        {
            if (turno % 2 == 0)
            {
                jugador = 'X';
            }
            else 
            {
                jugador = 'O';
            }
            System.out.println("Turno del jugador " + jugador);
            
            System.out.print("Seleccione la fila de la jugada: ");
            int fila = scan.nextInt();
            System.out.print("Seleccione la columna de la jugada: ");
            int columna = scan.nextInt();
            
            //if (fila >= 0 && fila <= 2 && columna >= 0 && columna <= 2)
            if (fila < 0 || fila > 2 || columna < 0 || columna > 2)
            {
                System.out.println("Jugada no permitida, coordenadas fuera de rango. Pierdes el turno...");
            }
            else if (tablero[fila][columna] != '-')
            //else if (tablero [fila][columna] == 'X' || tablero [fila][columna] == 'O')
            {
                System.out.println("Jugada no permitida, coordenadas previamente seleccionadas. Pierdes el turno...");
            }
            else 
            {
                tablero[fila][columna] = jugador;
            }
            
            for (int i = 0; i<tablero.length; i++)
            {
                for (int j = 0; j < tablero[i].length; j++)
                {
                    System.out.print(tablero [i][j] + " ");
                }
                System.out.println("");
            }
        }
        
            
    }
    
}
