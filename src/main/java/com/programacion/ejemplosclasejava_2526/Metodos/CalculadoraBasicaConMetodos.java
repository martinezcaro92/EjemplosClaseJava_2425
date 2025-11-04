/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Metodos;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class CalculadoraBasicaConMetodos {

    /**
     * Definir una calculadora que (en 1 sola iteración) tome datos de entrada y 
     * te permita escoger entre las operaciones de:
     * 1 - Suma
     * 2 - Resta
     * 3 - Multiplicación
     * 4 - Obtener el número complementario del primer valor introducido
     * 5 - Reimprimir valores introducidos
     * 
     * Debe realizarse con números enteros
     * Cada una de estas operaciones debe realizarse en un método independiente
     */
    
    public static int suma(int dato1, int dato2)
    {
        return dato1+dato2;
    }
    public static int resta(int dato1, int dato2)
    {
        return dato1-dato2;
    }
    public static int multiplicacion(int dato1, int dato2)
    {
        return dato1*dato2;
    }
    public static int complementario(int dato1)
    {
        return 0 - dato1;
    }
    public static void reimprimir(int dato1, int dato2)
    {
        System.out.println("El primer valor introducido es: "+dato1);
        System.out.println("El segundo valor introducido es: "+dato2);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Introduzca el primer valor: ");
        int valor1 = scan.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        int valor2 = scan.nextInt();
        
        System.out.println("Seleccione la opcion a realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Complementario");
        System.out.println("5. Reimprimir valores");
        
        System.out.println("");
        System.out.print("Introduzca la operacion a realizar: ");
        int opcion = scan.nextInt();
        int aux = 0;
        
        switch (opcion)
        {
            case 1:
                aux = suma(valor1, valor2);
                System.out.println("El resultado obtenido de la suma es: " + aux);
                break;
            case 2:
                aux = resta(valor1, valor2);
                System.out.println("El resultado obtenido de la resta es: " + aux);
                break;
            case 3:
                aux = multiplicacion(valor1, valor2);
                System.out.println("El resultado obtenido de la multiplicacion es: " + aux);
                break;
            case 4:
                aux = complementario(valor1);
                System.out.println("El resultado obtenido del complementario es: " + aux);
                break;
            case 5:
                reimprimir(valor1, valor2);
                break;
            default:
                System.out.println("Opción no contemplada");
                break;
        }
        
    }
    
}
