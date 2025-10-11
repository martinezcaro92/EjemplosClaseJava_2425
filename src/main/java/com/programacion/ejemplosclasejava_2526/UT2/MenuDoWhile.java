/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.UT2;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class MenuDoWhile {
    public static void main(String[] args) {
        int XX = 26;
        int YY = 1;
        
        int operacion, resultado;
        
        Scanner scan = new Scanner (System.in);
        
        do
        {
            System.out.println("Menú de operaciones. Seleccione su opción para realizar la operación: ");
            System.out.println("    1. Sumar");
            System.out.println("    2. Restar");
            System.out.println("    3. Multiplicar");
            System.out.println("    4. Dividir");
            System.out.println("    5. Modulo");            
            System.out.println("    6. Salida");
            
            operacion = scan.nextInt();
            switch (operacion)
            {
                case 1:
                    resultado = XX+YY;
                    System.out.println("Resultado (suma): " + resultado);
                    break;
                case 2:
                    resultado = XX-YY;
                    System.out.println("Resultado (resta): " + resultado);
                    break;
                case 3:
                    resultado = XX*YY;
                    System.out.println("Resultado (multiplicacion): " + resultado);
                    break;
                case 4:
                    resultado = XX/YY;
                    System.out.println("Resultado (division): " + resultado);
                    break;
                case 5:
                    resultado = XX%YY;
                    System.out.println("Resultado (modulo): " + resultado);
                    break;
//                case 6:
//                    System.out.println("Fin del programa");
//                    break;
                default:
                    System.out.println("Error al introducir la opción del menú");
                    break;
            }          
        } while (operacion != 6);
        System.out.println("Fin del programa");
    }
}
