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
        
        
        /* ENUNCIADO: Suponer que en una clase hay dos estudiantes que estudian 
            cinco módulos profesionales en dos cursos académicos. Definir y reservar 
            espacio para el array que almacene la información
        */
    }
}

