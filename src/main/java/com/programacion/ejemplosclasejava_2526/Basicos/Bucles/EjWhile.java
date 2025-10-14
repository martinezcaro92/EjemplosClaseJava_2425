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
public class EjWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* ENUNCIADO: Simula el funcionamiento de un cajero automático (números positivos y negativos)
            que se ejecute  mientras que el valor introducido sea diferente a 0, y tras introducir el valor, 
            se diga el total que hay en la cuenta bancaria. Comprobar que el total no sea < que 0.
        */
        
        Scanner scan = new Scanner (System.in);
        int cantidad = 1;
        int total = 0;
        
       
        
        while (cantidad != 0)
        {
            System.out.print("Introducir cantidad: ");
            cantidad = scan.nextInt();
            
            if(cantidad==0){
                break;
            }   
            
            total +=cantidad; // total = total + cantidad
            System.out.println("La cantidad total es: " + total);     
        }
        System.out.println("Prueba fuera de bucle");
        /* PSEUDOCÓDIGO:
            PROCESO Cajero:
                DEFINIR cantidad, total COMO ENTERO;
                cantidad <- 1;
                total <- 0;
                MIENTRAS cantidad != 0 HACER:
                    ESCRIBIR "Introducir cantidad: ";
                    LEER cantidad;
                    SI cantidad == 0 ENTONCES:
                        break;
                    FINSI
                    total <- total + cantidad;
                    ESCRIBIR "La cantidad total es: " + total;
            
        */
        
        
        
        
        /* ENUNCIADO: Se define e inicializa una contraseña numérica, se preguntará una contraseña numérica
            por teclado y se comprobará si es correcta. Se repitirá esta operación mientras no coincida la
            contraseña.
        */
    }
    
}
