/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Repasos.previoRecuperacion;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Realizar una algoritmo que muestre la tabla de multiplicar de 
            un número introducido por teclado. 
        */
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Introduzca un valor para realizar su tabla de multiplicar: ");
        
        int num = scan.nextInt();
        
        for (int i = 0; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
    
}
