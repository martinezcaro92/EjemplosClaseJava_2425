/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Metodos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class CalculadoraNotaMediaConMetodosAvanzada {

    /**
     * A partir de un array de 10 posiciones con notas de los estudiantes,
     * [6.4, 2.3, 5.5, 9.7, 1.2, 6.6, 7.9, 8.1, 3.5, 0.7]
     * 
     * Se pide realizar un programa que de forma iterativa (más de una ocasión)
     * permita las siguientes operaciones:
     * - 1 Nota máxima y nota mínima
     * - 2 Media y mediana
     * - 3 Array complementario (positivos <--> negativos)
     * - 4 Array ordenado ascendente
     * - 5 Array ordenado descendente
     * - 6 Sumar una constante a todas las posiciones del array
     *      * Leer por terminal el valor a sumar a cada posición
     *      * Sumar a cada posición la variable introducida
     * - 7 Salida del programa
     * 
     * Realizar este ejercicio haciendo uso de métodos para cada operación 
     * anteriormente descrita
     */
    
    public static double [] notaMaxMin (double [] notas)
    {
        double max = notas[0];
        double min = notas[0];
        
        for (int i = 0; i<notas.length; i++)
        {
            if (max < notas[i]) max = notas[i];
            if (min > notas[i]) min = notas[i];
        }
        double [] aux = {max, min};
        return aux;
    }
    
    public static double [] notaMediaMediana (double [] notas)
    {
        // Calcular media
        double total = 0;
        for (int i = 0; i < notas.length; i++)
        {
            total += notas[i];
        }
        double media = total/notas.length;
        
        //Calcular mediana
        double mediana = 0;
        double [] arrayOrdenado = ordenarArrayAsc(notas);
        
        int indice = arrayOrdenado.length / 2;
        if (arrayOrdenado.length % 2 == 0)
        {
            mediana = (arrayOrdenado[indice] + arrayOrdenado[indice-1])/2;
        } else {
            mediana = arrayOrdenado[indice];
        }
        
        double [] aux = {media, mediana};
        return aux;
    }
    
    public static double [] ordenarArrayAsc (double [] notas)
    {
        Arrays.sort(notas);
        return notas;
    }
    
    public static double [] ordenarArrayDesc (double [] notas)
    {
        double arrayAsc [] = ordenarArrayAsc(notas);
        double arrayDes [] = new double [arrayAsc.length];
        for (int i = 0; i< arrayAsc.length; i++)
        {
            arrayDes[i] = arrayAsc[arrayAsc.length - i - 1];
        }
        
        return arrayDes;
    }
    
    public static double [] arrayComplementario (double [] notas2)
    {
        for (int i = 0; i < notas2.length; i++)
        {
            notas2 [i] = 0 - notas2[i];
        }
        return notas2;
    }
    
    public static double [] sumarConstante (double [] notas, int constante)
    {
        for (int i = 0; i < notas.length; i++)
        {
            notas [i] += constante;
        }
        return notas;
    }
    
    public static void imprimirArrays (double [] notas)
    {
        System.out.print("[");
        for (int i = 0; i < notas.length; i++)
        {
            System.out.print(notas[i]);
            if (i != notas.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double notas [] = {6.4, 2.3, 5.5, 9.7, 1.2, 6.6, 7.9, 8.1, 3.5, 0.7};
        Scanner scan = new Scanner(System.in);
        int opcion;
        
             /* - 1 Nota máxima y nota mínima
     * - 2 Media y mediana
     * - 3 Array complementario (positivos <--> negativos)
     * - 4 Array ordenado ascendente
     * - 5 Array ordenado descendente
     * - 6 Sumar una constante a todas las posiciones del array
     *      * Leer por terminal el valor a sumar a cada posición
     *      * Sumar a cada posición la variable introducida
     * - 7 Salida del programa
             */
        
        do {
            System.out.println("Seleccione la opcion a realizar: ");
            System.out.println("1. Nota maxima y minima");
            System.out.println("2. Nota media y mediana");
            System.out.println("3. Array complementario");
            System.out.println("4. Array ordenado ascendente");
            System.out.println("5. Array ordenado descendente");
            System.out.println("6. Sumar constante a todas las posiciones");
            System.out.println("7. Salir");

            System.out.println("");
            System.out.print("Introduzca la operacion a realizar: ");
            opcion = scan.nextInt();
            System.out.println("");
            switch (opcion)
            {
                case 1:
                    System.out.println("La nota maxima es: " + notaMaxMin(notas)[0]);
                    System.out.println("La nota minima es: " + notaMaxMin(notas)[1]);
                    
//                    System.out.print("Las notas maxima y minima son: ");
//                    double [] aux = notaMaxMin(notas);
//                    for (int i = 0; i< aux.length; i++)
//                    {
//                        System.out.print(aux[i] + " ");
//                    }
                    break;
                case 2:
                    System.out.println("La nota media es: " + notaMediaMediana(notas)[0]);
                    System.out.println("La nota mediana es: " + notaMediaMediana(notas)[1]);
                    break;
                case 3:
                    double [] aux = arrayComplementario(notas);
                    System.out.println("El array complementario obtenido es: ");
                    imprimirArrays(aux);
                    break;
                case 4:
                    System.out.println("El array ordenado (ASC) es: ");
//                    double [] aux3 = ordenarArrayAsc(notas);
//                    imprimirArrays(aux3);
                    imprimirArrays(ordenarArrayAsc(notas));
                    break;
                case 5:
                    System.out.println("El array ordenado (DESC) es: ");
                    imprimirArrays(ordenarArrayDesc(notas));
                    break;
                case 6:
                    System.out.print("Introduzca la constante a sumar: ");
                    int constante = scan.nextInt();
                    double [] aux2 = sumarConstante(notas, constante);
                    imprimirArrays(aux2);
                    break;
                default:
                    System.out.println("Opción no contemplada");
                    break;
            }
        } while (opcion!=7);
        
    }
    
}
