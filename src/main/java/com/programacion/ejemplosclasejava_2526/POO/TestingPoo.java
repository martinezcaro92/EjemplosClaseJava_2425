/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class TestingPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona(11111111, "Jose Manuel", 
                                "Martinez", "C/ de mi casa");
        
        
        System.out.println("El DNI del usuario p1 es: " + p1.getDNI());
        p1.setDNI(22222222);
        System.out.println("El DNI del usuario p1 es: " + p1.getDNI());

        Persona p2 = new Persona();
        System.out.println("El DNI del usuario p2 es: " + p2.getDNI());
        System.out.println("El nombre del usuario p2 es: " + p2.getNombre());
        p2.setDNI(33333333);
        System.out.println("El DNI del usuario p2 es: " + p2.getDNI());
        p2.setNombre("Manolito");
        System.out.println("El nombre del usuario p2 es: " + p2.getNombre());

        //Persona p3 = new Persona(33333333); // Esto no es válido porque no existe un
        // constructor que tome sólo una variable de entrada de tipo entera
        
        Vehiculo v1 = new Vehiculo ();
        Vehiculo v2 = new Vehiculo ("1445LLL", "Seat", 1900, "negro", 4, "Ibiza");
        
    }   
    
}
