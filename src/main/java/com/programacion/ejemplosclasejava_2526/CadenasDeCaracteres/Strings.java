/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.CadenasDeCaracteres;

/**
 *
 * @author josem
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Defición de cadenas de caracteres utilizando char (NO EFICIENTE)
        char hola [] = {'h','o','l','a'};
        char hola2 [] = {104,111,108,97};
        
//        for (int i = 0; i< hola.length; i++)
//        {
//            System.out.print(hola[i]);
//        }
//        System.out.println("");
//        for (int i = 0; i< hola2.length; i++)
//        {
//            System.out.print(hola2[i]);
//        }

    /* DEFINICIÓN DE STRING: Un string son objetos de JAVA que pertiten
        trabajar eficientemente con cadenas de caracteres (texto). Se 
        codifica mediante Unicode.
    */
        String saludo = "Hola clase SDAW1";
        System.out.println(saludo);
        
    /* A este tipo de dato (String), se le pueden realizar una serie de 
        operaciones como las que se mencionan a continuación.
        */
    
    // Longitud de la cadena de caracteres (length)
    /*  int length (): 
            - int: tipo de dato que devuelve
            - length: nombre del método que se llama
            - (): indica que es un método. Según el método, puede incorporar argumentos
    */
        
        System.out.println("Longitud de la cadena saludo es: " + saludo.length());
        String vacio = "";
        System.out.println("Longitud de la cadena vacio es: " + vacio.length());
    
    /* equals (String b)
        A partir de un String a, se compara (equals) con un String b
    */
        String a = "hola";    
        String b = "Hola";
        System.out.println(a.equals(b));
        // System.out.println(a==b); // NO EMPLEAR EN CADENAS DE TEXTO ESTE MÉTODO
        
    /* equalsIgnoreCase(String b)
        A partir de un String a, compara con un string b para saber si son iguales
         pese a existir diferencias entre mayúsculas y minúsculas.
        */
        System.out.println(a.equalsIgnoreCase(b));
    
    /* compareTo (String b) 
        Al contrario que los métodos anteriores que devolvían true/false, este 
        método devuelve la diferencia numérica entre los caracteres almacenados.
        Si es el mismo valor, el método compareTo() devolverá 0.
    */
        System.out.println(a.compareTo(b));
    
    /* trim()
        crea un nuevo objeto eliminado el espacio en blanco que pudiera haber 
        al principio o al final
    */
        String saludo1 = "    Hola clase SDAW1     ";
        System.out.println(saludo1.trim());
        
    /* charAt (int p)
        nos idica, dentro de una cadena de caracteres, el caracter que ocupa la posicion p
    */
        System.out.println(saludo1.charAt(9));
    
    /* toCharArray()
        conviertr la cadena en un array de caracteres
    */
        char [] saludo2 = saludo1.toCharArray();
//        for(int i = 0; i<saludo2.length; i++)
//        {
//            System.out.println(saludo2[i]);
//        }
        System.out.println(saludo2.length); // Esta línea y la siguiente son equivalentes (array)
        System.out.println(saludo1.length()); // (cadena de caracteres)
        
    /* substring (int a, int z)
        extrae la sub-cadena entre las posiciones a y z
        */    
        System.out.println(saludo1.substring(4, 8));
        
    /* substring (int desde)
        extrae la sub-cadena desde la posición indicada
        */
        System.out.println(saludo1.substring(4));
        
    /* indexOf (String cadena)
        indica en qué posición se encuentra la cadena indicado por 
        primera vez, buscandodesde el principio
        */    
        System.out.println(saludo1.indexOf("Hola"));
        
        // Ejemplo más complejo
        String buscar = "Hola";
        System.out.println(saludo1.substring(saludo1.indexOf(buscar), (saludo1.indexOf(buscar)+buscar.length())));
        
       /* lastIndexOf (String cadena)
        indica en qué posición se encuentra el carácter (o cadena) indicado por primera vez, buscando desde el final
        */
       
        String texto = "Jose Manuel";
        System.out.println(texto.lastIndexOf("e"));
        
        String texto2 = "Hola Mundo Mundo";
        System.out.println(texto2.lastIndexOf("Mundo"));
        System.out.println(texto2.lastIndexOf("mundo"));
        System.out.println(texto2.lastIndexOf("w"));
        // Las dos líneas anteriores no coinciden con el contenido de texto2. En ese
        // caso imprime el valor -1
        
        /* startsWith (String prefijo)
            dice si la cadena comienza con el prefijo indicado
        */
        System.out.println(texto2.startsWith("Hola"));  // Devuelve true
        System.out.println(texto2.startsWith("Mundo")); // Devuelve false
        
        /* endsWith (String sufijo)
            dice si la cadena termina con el sufijo indicado
        */
        String correo = "nombre.apellido@iesramonarcas.es";
        System.out.println(correo.endsWith("@iesramonarcas.es")); // Devuelve true
        System.out.println(correo.endsWith("@iesjuanbosco.es")); // Devuelve false
        
        /* String[] split(String patron)
            fragmenta la cadena en varias subcadenas utilizando el patrón indicado como separador
        */
        String [] correo2 = correo.split("@");
        for (int i = 0 ; i<correo2.length; i++){
            System.out.println("Posición " + i +": " + correo2[i]);
        }
        String [] correo3 = correo.split("[@.]");
        for (int i = 0 ; i<correo3.length; i++){
            System.out.println("Posición " + i +": " + correo3[i]);
        }
    }
    
}
