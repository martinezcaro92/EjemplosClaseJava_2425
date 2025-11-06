/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Metodos;

import static com.programacion.ejemplosclasejava_2526.Metodos.CalculadoraBasicaConMetodos.complementario;
import static com.programacion.ejemplosclasejava_2526.Metodos.CalculadoraBasicaConMetodos.multiplicacion;
import static com.programacion.ejemplosclasejava_2526.Metodos.CalculadoraBasicaConMetodos.reimprimir;
import static com.programacion.ejemplosclasejava_2526.Metodos.CalculadoraBasicaConMetodos.resta;
import static com.programacion.ejemplosclasejava_2526.Metodos.CalculadoraBasicaConMetodos.suma;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class CalculadoraNotaMediaConMetodos {

    /**
     * A partir de un array de 10 posiciones con notas de los estudiantes,
     * [6.4, 2.3, 5.5, 9.7, 1.2, 6.6, 7.9, 8.1, 3.5, 0.7]
     * 
     * Se pide realizar un programa que de forma iterativa (más de una ocasión)
     * permita las siguientes operaciones:
     * - 1 Nota media de la clase
     * - 2 Nota máxima de la clase
     * - 3 Contador de estudiantes aprobados
     * - 4 Porcentaje de aprobados
     * - 5 Salida del programa
     * 
     * Realizar este ejercicio haciendo uso de métodos para cada operación 
     * anteriormente descrita
     */
    
    public static double notaMedia(double [] notas)
    {
        double total = 0;
        for (int i = 0; i < notas.length; i++)
        {
            total += notas[i];
        }
        return total/notas.length;
    }
    
    public static double notaMaxima (double [] notas)
    {
        //double max = 0; //esto sería correcto, pero no óptimas
        double max = notas[0]; //esto sería óptimo
        for (int i = 0; i < notas.length; i++)
        {
            if(max<notas[i])
            {
                max = notas[i];
            }
        }
        return max;
    }
    
    public static double contadorAprobados (double [] notas)
    {
        double aprobados = 0; //esto sería óptimo
        for (int i = 0; i < notas.length; i++)
        {
            if(notas[i]>=5)
            {
                aprobados++;
            }
        }
        return aprobados;
    }
    
    public static double porcentajeAprobados (double [] notas)
    {
        return 100*contadorAprobados(notas)/notas.length;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double notas [] = {6.4, 2.3, 5.5, 9.7, 1.2, 6.6, 7.9, 8.1, 3.5, 0.7};
        int opcion;
        
        do {
            System.out.println("Seleccione la opcion a realizar: ");
            System.out.println("1. Nota media");
            System.out.println("2. Nota maxima");
            System.out.println("3. Contador aprobados");
            System.out.println("4. Porcentaje aprobados");
            System.out.println("5. Salir");

            System.out.println("");
            System.out.print("Introduzca la operacion a realizar: ");
            opcion = scan.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("La nota media es: " + notaMedia(notas));
                    break;
                case 2:
                    System.out.println("La nota maxima es: " + notaMaxima(notas));
                    break;
                case 3:
                    System.out.println("El numero de aprobados es: " + contadorAprobados(notas));
                    break;
                case 4:
                    System.out.println("El porcentaje de aprobados es: " + porcentajeAprobados(notas));
                    break;
                default:
                    System.out.println("Opción no contemplada");
                    break;
            }
        } while (opcion!=5);
    }
    
}
