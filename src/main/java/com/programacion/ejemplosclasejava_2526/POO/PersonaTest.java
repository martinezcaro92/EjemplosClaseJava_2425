/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class PersonaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona(11111111, "Jose Manuel", 
                                "Martinez", "C/ de mi casa");
        
        
        System.out.println("El DNI del usuario es: " + p.getDNI());
        
        p.setDNI(22222222);
        
        System.out.println("El DNI del usuario es: " + p.getDNI());

    }   
    
}
