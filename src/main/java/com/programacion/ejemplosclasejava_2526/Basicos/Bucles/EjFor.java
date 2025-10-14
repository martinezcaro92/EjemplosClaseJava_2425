package com.programacion.ejemplosclasejava_2526.Basicos.Bucles;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class EjFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* ENUNCIADO: Simula el funcionamiento de un cajero automático (números positivos y negativos)
            que se ejecute de mientras que el valor introducido sea diferente a 0 que tras introducir el valor, 
            se diga el total que hay en la cuenta bancaria
        */
        
        /* ENUNCIADO: Se define e inicializa una contraseña numérica, se preguntará una contraseña numérica
            por teclado y se comprobará si es correcta. Se repitirá esta operación 100 veces mientras no coincida la
            contraseña.
        */
        
        int contrasena = 1234567;
        int contrasena2;
        Scanner scan = new Scanner (System.in);
        
        for (int i = 0; i< 5; i++) // for(int i =0; i<=99; i++){}
        {
            System.out.print("Introducir contrasena: ");
            contrasena2=scan.nextInt();
            if (contrasena == contrasena2)
            {
                System.out.println ("Contrasena correcta");
                break;
            }
            System.out.println ("Contrasena incorrecta");
            /* else {
                System.out.println ("Contrasena incorrecta");
            }*/
            
        }
        
        
    }
    
}
