/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Metodos;

/**
 *
 * @author josem
 */
public class CodigoOptimizadoMetodos {

    public static void main(String[] args) {
        
        // Saludo para Natalia
        saludarUsuario("Natalia");
        // Saludo para Luis
        saludarUsuario("Luis");
        
    } // Fin del main
    
    public static void saludarUsuario(String nombre) {
        System.out.println("*************************");
        System.out.println("¡Hola, " + nombre + "!");
        System.out.println("Bienvenid@ al sistema.");
        System.out.println("Que tengas un buen día.");
    }
}
