/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251113;

/**
 *
 * @author user
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // ================================================================
    // a) Contar cuántos elementos son mayores que un valor dado
    // ================================================================
    public static int contarMayoresQue(int[] array, int valor) {
        int contador = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i] > valor) {
                contador++;
            }
        }
        return contador;
    }

    // ================================================================
    // b) Modificar el orden del array según una variable booleana
    // ================================================================
    public static int[] modificarArray(int[] array, boolean condicion) {
        int[] resultado = new int[array.length];

        if (condicion == true) {
            // Si es TRUE: primero pares, luego impares
            int indiceInicio = 0;
            int indiceFinal = array.length - 1;

            for (int i = 0; i<array.length; i++){
                if (array[i] % 2 == 0) {
                    resultado[indiceInicio++] = array[i];
                } else {
                    resultado[indiceFinal--] = array[i];
                }
            }
        } else {
            // Si es FALSE: invertir el orden del array
            for (int i = 0; i < array.length; i++) {
                resultado[i] = array[array.length - 1 - i];
            }
        }

        return resultado;
    }

    // ================================================================
    // c) Reorganizar un array unidimensional en una matriz cuadrada
    // ================================================================
    public static int[][] reorganizarEnMatriz(int[] array, int dimension) {
        int[][] matriz = new int[dimension][dimension];
        int index = 0; // posición actual en el array

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (index < array.length) {
                    matriz[i][j] = array[index++];
                } else {
                    matriz[i][j] = 0; // completar con ceros si faltan datos
                }
            }
        }

        return matriz;
    }
    
}
