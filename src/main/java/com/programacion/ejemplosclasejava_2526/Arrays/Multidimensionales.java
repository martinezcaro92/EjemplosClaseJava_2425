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
public class Multidimensionales {

    /* DEFINCIÓN: Un array multidimensional es una estructura que permite almacenar
            varios datos (con filas, columnas y profundidad) de un mismo tipo. 
            Algunos ejemplos prácticos son:
            - 3D:
                * Caras de un dado
                * Cubo de Rubik
                * Representación 3D [x][y][z]
                * Calendario [meses][semanas][dias]
                * Codificacion RGB [R][G][B]
            - 4D:
                * Representación 3D en el tiempo [x][y][z][t]
                * Estación meteorológica [ciudad][hora][minuto][segundo]
            - 5D:
                * Imagen con codificación RGB en pixel [alto][ancho][R][G][B]
                * Estación meteorológica con más de un sensor [ciudad][hora][minuto][segundo][sensor]
            
        Se deberá tener en cuenta:
            - La dimensión del array --> Al tratarse de un array multidimensional, un
                array tendrá X filas, Y columnas, PERO NO ESTÁ ACOTADO EL NÚMERO DE 
                DIMENSIONES.
                    * Si se trata de Array multidimensional 3D, su dimensión será de (M,N,K).
                    * Si se trata de Array multidimensional 4D, su dimensión será de (M,N,K,P).
                    * Y así sucesivamente...
    
        La definición de arrays multidimensionales en Java se realiza de la siguiente manera:
            - Declaración: 
                tipoVariable nombreVariable [][]...[];
                * 3D:
                    - tipoVariable nombreVariable [][][];
                * 4D:
                    - tipoVariable nombreVariable [][][][];
                * 5D:
                    - tipoVariable nombreVariable [][][][][];
            - Declaración y reserva de espacio:
                tipoVariable [][]..[] nombreVariable = new tipoVariable [X][Y]...[K]; 
                * 3D:
                    - tipoVariable [][][] nombreVariable = new tipoVariable [X][Y][Z];
                * 4D:
                    - tipoVariable [][][][] nombreVariable = new tipoVariable [X][Y][Z][K];
                * 5D:
                    - tipoVariable [][][][][] nombreVariable = new tipoVariable [X][Y][Z][K][P];
            - Declaración e inicialización:
                tipoVariable [][]...[] nombreVariable = {{{..}},{{..}}}; // En este caso el array tiene dimensión (2,3)
                * 3D:
                    - tipoVariable [][][] = {{{},{}},{{},{}}};
                * 4D:
                    - tipoVariable [][][][] = {{{{},{}},{{},{}}},{{{},{}},{{},{}}}};
                * 5D:
                    - tipoVariable [][][][][] = {{{{{},{}},{{},{}}},{{{},{}},{{},{}}}},{{{{},{}},{{},{}}},{{{},{}},{{},{}}}}};
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /* ENUNCIADOS: Definir los arrays multidimensionales que cumplan con:
            - aux1 con (2x2x2) de tipo entero --> Declaración e inicialización
            - aux2 con (4x4x4x4) de tipo entero --> Declaración y reserva de espacio
            - test con (2x3x5) de tipo double --> Declaración
            - var con (10x5x2x3) de tipo char --> Declaración y reserva de espacio
        */
        
        int aux1 [][][] = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int aux2 [][][][] = new int [4][4][4][4];
        double test [][][];
        char [][][][] var = new char [10][5][2][3];
        
        /* ENUNCIADO: Suponer que en una clase hay dos estudiantes que estudian 
            cinco módulos profesionales en dos cursos académicos. Definir y reservar 
            espacio para el array que almacene la información
        */
        int notas [][][] = new int [2][5][2];
        // Se genera una dimensión por cada tipo de dato (estudiantes, módulos 
        // profesionales y cursos académicos.
        
        /* RECORRIDO DE ARRAYS MULTIDIMENSIONALES
            Al igual que en en arrays unidimensionales y multidimensionales, se utiliza  
            un bucle for para recorrer todas las posiciones, dado que su dimensión es 
            de (N,...,N); en un array multidimensional, se deben emplear tantos bucles for  
            como dimensiones tenga el array para recorrer todas sus posiciones. 
            Estos bucles for se encuentran anidados.
        
            for (int i = 0; i<var.length; i++){
                for (int j = 0; j<var[i].length; j++) {
                    ...
                        for (int q = 0; q<var[i][j]...[p].lenght; q++){
                            // Cualquier acción que involucre a var[i][j]...[q]
                        }
                }
            }
            * 3D:
                for (int i = 0; i<var.length; i++){
                    for (int j = 0; j<var[i].length; j++) {
                        for (int k = 0; k<var[i][j].lenght; k++){
                            acciones con array[i][j][k];
                        }
                    }
                }
            * 4D:
                for (int i = 0; i<var.length; i++){
                    for (int j = 0; j<var[i].length; j++) {
                        for (int k = 0; k<var[i][j].lenght; k++){
                            for (int l = 0; l<var[i][j][k].lenght; l++){
                                acciones con array[i][j][k][l];
                            }
                        }
                    }
                }
            * 5D:
                for (int i = 0; i<var.length; i++){
                    for (int j = 0; j<var[i].length; j++) {
                        for (int k = 0; k<var[i][j].lenght; k++){
                            for (int l = 0; l<var[i][j][k].lenght; l++){
                                for (int m = 0; m<var[i][j][k][l].lenght; m++){
                                    acciones con array[i][j][k][l][m];
                                }
                            }
                        }
                    }
                }
        */
//        //Definir y reservar memoria para un array de 3x2x3 llamado prueba, e imprimir
//        // los indicadores de cada posición (no los valores de cada posición).
//        
//        int prueba [][][] = new int [3][2][3];
//        
//        for (int i = 0; i < prueba.length; i++) {
//            for (int j = 0; j < prueba[i].length; j++){
//                for (int k = 0; k< prueba[i][j].length; k++){
//                    System.out.println("["+i+"]["+j+"]["+k+"]");
//                }
//            }
//        }
//        
//        //Definir y reservar memoria para un array de 5x3x6x9x5 llamado prueba2, e imprimir
//        // los indicadores de cada posición (no los valores de cada posición).
//        int prueba2 [][][][][] = new int [5][3][6][9][5];
//        
//        for (int i = 0; i < prueba2.length; i++) {
//            for (int j = 0; j < prueba2[i].length; j++){
//                for (int k = 0; k< prueba2[i][j].length; k++){
//                    for (int l = 0; l < prueba2[i][j][k].length; l++){
//                        for (int m = 0; m< prueba2[i][j][k][l].length; m++){
//                            System.out.println("["+i+"]["+j+"]["+k+"]["+l+"]["+m+"]");
//                        }
//                    }
//                }
//            }
//        }

    /* Imprimir los valores almacenados en el array multidimensional aux1
        int aux1 [][][] = {{{1,2},{3,4}},{{5,6},{7,8}}};
        Indicar antes del valor almacenado la posición que ocupa.
    */
        for (int i = 0; i < aux1.length; i++) {
            for (int j = 0; j < aux1[i].length; j++){
                for (int k = 0; k< aux1[i][j].length; k++){
                    //Solución 1
//                    System.out.print("["+i+"]["+j+"]["+k+"] = ");
//                    System.out.println(aux1[i][j][k]);
                    
                    //Solución 2
                    System.out.println("["+i+"]["+j+"]["+k+"] = " + aux1[i][j][k]);
                }
            }
        }
    }
}

