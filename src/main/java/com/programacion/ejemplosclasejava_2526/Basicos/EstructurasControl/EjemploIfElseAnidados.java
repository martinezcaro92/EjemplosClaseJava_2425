/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Basicos.EstructurasControl;

/**
 *
 * @author josem
 */
public class EjemploIfElseAnidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Un if puede tener un sólo else asociado, o acompañar un else de otro if
            para realizar otras comprobaciones. Esto ocurre para condiciones no binarias, 
            es decir, cuando una variable puede tomar varios valores.
        Ejemplo: según la hora del día saludar con "Buenos días", "Buenas tardes" 
            o "Buenas noches".
        */
        
        int hora = 8;
        if(hora<8){
            System.out.println("Buenas noches");
        }else if(hora<14){
            System.out.println("Buenos dias");
        }else{
            System.out.println("Buenas tardes");
        }
        
//        int hora = 25;
//        if(hora>=0 && hora<8){  // Si la hora es entre las 00 y las 08 (no inclusive)
//            System.out.println("Buenas noches");
//        }else if(hora>=8 && hora<14){ // Si la hora es entre las 08 (inclusive) y las 14 (no inclusive)
//            System.out.println("Buenos dias");
//        }else if (hora <24){ // Si la hora es entre las 14 (inclusive) y las 24 (no inclusive)
//            System.out.println("Buenas tardes");
//        }else { // Si la hora es menor que 0 (no inclusive) y mayor que 24 (inclusive)
//            System.out.println("Error en la hora contemplada");
//        }
        
/* PROCESO SaludoHorario:
    DEFINIR hora COMO ENTERO;
    hora = 8;
    SI hora >= 0 Y hora < 8 ENTONCES:
        ESCRIBIR "Buenas noches!");
    SINO SI hora >=8 Y hora < 14 ENTONCES;
        ESCRIBIR "Buenos días!";
    SINO
        ESCRIBIR "Buenas tardes!";
    FIN_SI
FIN_PROCESO
*/

        
        
        
    }
    
}
