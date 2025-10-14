/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Basicos.Bucles;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* ENUNCIADO: Simula el funcionamiento de un cajero automático (números positivos y negativos)
            que se ejecute de mientras que el valor introducido sea diferente a 0 que tras introducir el valor, 
            se diga el total que hay en la cuenta bancaria
        */
        
        /* ENUNCIADO: Se define e inicializa una contraseña numérica (entera), se preguntará una contraseña numérica
            por teclado y se comprobará si es correcta. Se repitirá esta operación mientras no coincida la
            contraseña.
        */
        
        int contrasena = 1234;
        Scanner scan = new Scanner (System.in);
        int contrasena2;
        
        do {
            System.out.print("Introduzca la contrasena: ");
            contrasena2 = scan.nextInt();
        } while (contrasena != contrasena2);
        System.out.println("Contraseña correcta");

        
        
    }
    
}
