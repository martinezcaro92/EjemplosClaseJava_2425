/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Repasos.PrevUT3;

/**
 *
 * @author josem
 */
public class DivisoresNumeroConMetodosArray {

    /**
     * Se trata de realizar un método que a partir de un número entero (pasado como argumento)
     * se obtenga un array que contenga todos los números que sean divisibles. Otro método 
     * comprobará si el número es divisible perfecto (la suma de todos sus divisores suman el propio
     * número)
     */
    public static int obtenerNumeroDivisores (int numero)
    {
        int contador = 0;
        for (int i = 1; i<numero;i++)
        {
            if (numero % i == 0)
            {
                contador++;
            }
        }
        return contador;
    }
    
    
    public static int [] obtenerDivisores (int numero)
    {
        int [] aux = new int [obtenerNumeroDivisores(numero)];
        int contador = 0;
        for (int i = 1; i<numero;i++)
        {
            if (numero % i == 0)
            {
                aux[contador] = i;
                contador++;
            }
        }
        return aux;
    }
    
    public static boolean comprobarNumeroPerfecto (int [] array, int numero)
    {
        int acumulador = 0;
        for (int i = 0; i<array.length; i++)
        {
            acumulador += array[i];
        }
        if (acumulador == numero)
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void imprimirArray (int [] array)
    {
        System.out.print("[");
        for (int i = 0; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 28;
        int divisores [] = obtenerDivisores(numero);
        imprimirArray(divisores);
        boolean numPer = comprobarNumeroPerfecto(divisores, numero);
        System.out.println("El numero " + numero + " es perfecto? " + numPer);
    }
    
}
