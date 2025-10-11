/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Basicos;

/**
 *
 * @author josem
 */
public class Ej4ViajeEstudios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numEstudiantes = 22;
        double precioAutobus = 0;
        double precioEstudiante = 0;
        
        if (numEstudiantes>=100)
        {
            precioEstudiante = 65;
            precioAutobus = precioEstudiante * numEstudiantes;
        }else if(numEstudiantes>=50)
        {
            precioEstudiante = 70;
            precioAutobus = precioEstudiante * numEstudiantes;
        }else if (numEstudiantes>=30)
        {   
            precioEstudiante = 95;
            precioAutobus = precioEstudiante * numEstudiantes;
            
        } else if (numEstudiantes>0)
        {
            precioAutobus = 4000;
            precioEstudiante = precioAutobus / numEstudiantes;
        } else
        {
            System.out.println("numEstudiantes contemplado no válido (" + numEstudiantes + ")");
        }
        System.out.println("El número de estudiantes es: " + numEstudiantes);
        System.out.println("Precio por estudiante: " + precioEstudiante);
        System.out.println("Precio total Autobus: " + precioAutobus);

    }
    
}
