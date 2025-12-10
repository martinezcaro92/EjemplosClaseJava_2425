/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class Deportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EquipoDeportivo eliocroca = new EquipoDeportivo();
        EquipoDeportivo lorcaDeportiva = new EquipoDeportivo("Lorca Deportiva");
        eliocroca.setNombre("Eliocroca");
        
        System.out.println("El nombre del equipo es: " + eliocroca.getNombre());
        System.out.println("El nombre del equipo es: " + lorcaDeportiva.getNombre());
        
    }
    
}
