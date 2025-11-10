/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Repasos.PrevUT3;

/**
 *
 * @author josem
 */
public class StringEj13 {

    /**
     * Enunciado: Define la cadena String query =
     * "producto=portatil&marca=asus&orden=precio". Usa el método split() dos
     * veces para mostrar cada clave y valor por separado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String query =  "producto=portatil&marca=asus&orden=precio";
        String [] query2 = query.split("&");
        
        for(int i = 0; i< query2.length; i++)
        {
            String [] query3 = query2[i].split("=");
            System.out.println("Clave: " + query3[0]);
            System.out.println("Valor: " + query3[1]);
            System.out.println("------------------------");
        }
        
        
    }
    
}
