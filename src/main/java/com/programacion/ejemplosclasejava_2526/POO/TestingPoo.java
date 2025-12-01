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
        
        /*Los arrays, además de los tipos de datos utilizados hasta ahora, también
            pueden ser definidos para almacenar objetos. A continuación, se muestra
            un ejemplo */
        
        Vehiculo vh1 [] = new Vehiculo [2];
        vh1[0] = v1;
        vh1[1] = v2;
        
        Vehiculo vh2 [] = {v1, v2};
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        
        Vaso va1 = new Vaso ("taza", "redonda", "blanca", "ceramica", "ninguno");
        Auto au1 = new Auto ();
        Rectangulo r1 = new Rectangulo ();
        
        System.out.println(va1.toString());
        System.out.println(au1.toString());
        System.out.println(r1.toString());

        Vaso va2 = new Vaso ("copa", "alargada", "transparente", "vidrio", "ninguno");
        Vaso va3 = new Vaso ("chupito", "pequeño", "color", "plastico", "ninguno");

        /* A continuación se genera un array de tipo Vaso (llamado vs_array) con 3 posiciones*/
        Vaso vs_array [] = new Vaso [3];
        /*Ahora se procede a almacenar en cada posición del array (vs_array) un objeto Vaso concreto*/
        // vs_array va1[]= new Vaso [0]; --> Esto es incorrecto
        vs_array[0] = va1;
        vs_array[1] = va2;
        vs_array[2] = va3;
        
        System.out.println("");
        /*Al tener los objetos almacenados en un array, se puede acceder a ellos mediante
            un bucle. Como venimos utilizando en arrays, haremos uso de un bucle for*/
        
        for (int i = 0; i < vs_array.length; i++)
        {
            /*Si el método toString() existe dentro de un objeto, las dos líneas siguientes
                son equivalentes*/
            System.out.println(vs_array[i]);
            //System.out.println(vs_array[i].toString());
        }
    }   
    
}
