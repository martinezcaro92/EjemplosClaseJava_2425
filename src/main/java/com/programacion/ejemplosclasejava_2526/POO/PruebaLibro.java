/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class PruebaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cramos los tres objetos libro
        Libro libro1 = new Libro ("1984","G. Oswell",1948);
        Libro libro2 = new Libro ("L001","Moby Dick", "Mervill, H.",1851);
        Libro libro3 = new Libro ("50 Sombras","Mike M.",2010);
        
        // Añadimos ISBN a libro1
        libro1.setIsbn("A001");
        
        // Imprimimos la bibliografía
        System.out.println("Mostrar bibliografías (previa)");
        System.out.println(libro1.citaBibliografica());
        System.out.println(libro2.citaBibliografica());
        System.out.println(libro3.citaBibliografica());
        
//        libro1 = libro2;
//        System.out.println("");
//        System.out.println("Mostrar bibliografías (posterior)");
//        System.out.println(libro1.citaBibliografica());
//        System.out.println(libro2.citaBibliografica());

        Libro listaLibros [] = new Libro [10];
        listaLibros[0] = libro1;
        listaLibros[1] = libro2;
        listaLibros[2] = libro3;
        
        Libro libros [] = {libro1, libro2, libro3};
    }
    
}
