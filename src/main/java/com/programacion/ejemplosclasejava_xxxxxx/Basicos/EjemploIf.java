/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_xxxxxx.Basicos;

/**
 *
 * @author josem
 */
public class EjemploIf {
    public static void main(String[] args) {
        /* DEFINICIÓN IF: Es una estructura condicional que nos permite acceder
        *  a unas determinadas acciones si se cumple una condición.
        *  
        *  ESTRUCTURA BÁSICA: 
        *  if (condición) {
        *      acción_1;
        *      acción_2;
        *  }
        *
        *  EJEMPLOS EJECUTABLES:
        */
        
        // Ejemplo aprobado
        int nota = 3;
        if (nota>=5){
            System.out.println("Aprobado");
        }
        // Ejemplo aprobado (PSEUDOCÓDIGO)
        /* 
        PROCESO EjemploAprobado:
            DEFINIR nota COMO ENTERO;    --> int nota;
            nota <- 3;                  --> nota = 3;
            SI nota >= 5 ENTONCES:
                ESCRIBIR "Aprobado";
            FINSI
        FINPROCESO
        */
        
        boolean esMayorEdad = false;
        int edad = 20;
        
        if (edad >=18)
        {
            esMayorEdad = true;
        }
        System.out.println("¿Es mayor de edad?" + esMayorEdad);
        /*
            PROCESO EsMayorEdad:
                DEFINIR edad COMO ENTERO;
                DEFINIR esMayorEdad COMO BOOLEANO;
                edad <- 20;
                esMayorEdad <- false;
                SI edad >=18 ENTONCES:
                    esMayorEdad <- true;
                FINSI
                ESCRIBIR "¿Es mayor de edad?" + esMayorEdad;
            FINPROCESO
        */
    }
    
}
