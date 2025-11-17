/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251113;

/**
 *
 * @author user
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // a) Identificar la posición (índice) de la última letra 'a' en "manzana"
        String palabra = "manzana";
        int ultimaPosicionA = palabra.lastIndexOf('a');
        System.out.println("a) Última posición de 'a': " + ultimaPosicionA);

        // b) Imprimir el dominio del mail "profesor@iesramonarcas.es"
        String correo = "profesor@iesramonarcas.es";
        int posicionArroba = correo.indexOf('@');
        String dominio = correo.substring(posicionArroba + 1);
        System.out.println("b) Dominio del correo: " + dominio);

        // c) Detectar el número de veces que aparece la letra 'e'
        String frase = "No me pises que llevo chanclas";
        int contadorE = 0;

        // Recorremos la cadena letra a letra
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'e') {
                contadorE++;
            }
        }
        System.out.println("c) Número de 'e' en la frase: " + contadorE);

        // d) Comprobar si utiliza el protocolo HTTPS
        String url = "http://iesramonarcas.es";
        boolean usaHttps = url.startsWith("https://");
        System.out.println("d) ¿Usa HTTPS?: " + usaHttps);
    }
    
}
