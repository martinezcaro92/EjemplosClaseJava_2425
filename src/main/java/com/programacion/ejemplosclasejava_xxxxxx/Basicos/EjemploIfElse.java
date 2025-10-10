/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_xxxxxx.Basicos;

/**
 *
 * @author josem
 */
public class EjemploIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nota = 8;
        if (nota>=5)
        {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
        
        /* 
            PROCESO EjemploIfElse:
                DEFINIR nota COMO ENTERO;
                nota <- 8;
                SI nota >=5 ENTONCES:
                    ESCRIBIR "Aprobado";
                SINO:
                    ESCRIBIR "Suspenso";
                FINSI
            FINPROCESO
        */
        
        /* ENUNCIADO: Definir una variable booleana (esChica) que se inicialice con valor true
            y compruebe su valor para imprimir "Es chica" o "Es chico".
        */
        boolean esChica = true;
        if (esChica==true)
        {
            System.out.println("Es chica");
        } else{
            System.out.println("Es chico");
        }
        
    }
    
}
