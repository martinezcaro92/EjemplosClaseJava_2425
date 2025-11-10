/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Repasos.PrevUT3;

/**
 *
 * @author josem
 */
public class StringEj15 {

    /**
     * Crea una cadena con un nombre completo, como "Juan Pérez García". 
     * Separa el nombre en palabras y muestra las iniciales de cada palabra 
     * seguidas de un punto (Ej: "J.P.G.").
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Juan Perez Garcia";
        String [] nombreSeparado = nombre.split(" ");
        
        for (int j = 0; j<nombreSeparado.length;j++)
        {
            System.out.print(nombreSeparado[j].charAt(0) + ".");
        }
    }
    
}
