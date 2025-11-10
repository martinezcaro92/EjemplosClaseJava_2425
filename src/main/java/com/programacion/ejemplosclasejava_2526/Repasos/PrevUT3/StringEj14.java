/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Repasos.PrevUT3;

/**
 *
 * @author josem
 */
public class StringEj14 {

    /**
     * Enunciado: Define "Desarrollo de Aplicaciones Web". Conviértela a un
     * array de caracteres y recórrelo para contar cuántas vocales contiene.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "Desarrollo de Aplicaciones Web";
        String fraseMinuscula = frase.toLowerCase();
        char [] frase2 = fraseMinuscula.toCharArray();
        
        int contador = 0;
        for (int i = 0; i<frase2.length; i++)
        {
            contador += checkVowel (frase2[i]);
        }
        System.out.println("El numero de vocales es: " + contador); 
    }
    public static int checkVowel (char letra)
    {
        if (letra == 'a' || letra == 'e'|| letra == 'i'|| letra == 'o' || letra == 'u')
        {
            return 1;
        }
        else {
            return 0;
        }
    }
    
}
