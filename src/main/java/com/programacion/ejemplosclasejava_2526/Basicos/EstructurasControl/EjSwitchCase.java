/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Basicos.EstructurasControl;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjSwitchCase 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        /* ENUNCIADO: Diseña un programa (1 iteración) que muestre un menú con operaciones: 
            ingresar dinero, retirar dinero, consultar saldo, salir.
        */
        /* 
            PROCESO OperacionesBancarias:
                DEFINIR operacion, cantidad, total COMO ENTERO;
                ESCRIBIR "Seleccione operación:";
                ESCRIBIR "1. Ingresar dinero.";
                ESCRIBIR "2. Retirar dinero.";
                ESCRIBIR "3. Consultar saldo.";
                ESCRIBIR "4. Salir.";
                LEER operacion;
        
                SEGUN operacion HACER:
                    1:  ESCRIBIR "Defina la cantidad a ingresar: ";
                        LEER cantidad;
                        SI cantidad <= 0 ENTONCES:
                            ESCRIBIR "Error";
                        SINO
                            total <- total + cantidad;
                            ESCRIBIR "Operación realizada: " + total;
                        FINSI
                    2:  ESCRIBIR "Defina la cantidad a retirar: ";
                        LEER cantidad;
                        SI cantidad <= 0 ENTONCES:
                            ESCRIBIR "Error";
                        SINO
                            SI cantidad > total ENTONCES:
                                ESCRIBIR "No hay saldo suficiente";
                            SINO
                                total <- total - cantidad;
                                ESCRIBIR "Operación realizada: " + total;
                            FINSI    
                        FINSI
                    3: ESCRIBIR "cantidad: " + total;
                    4: ESCRIBIR "Salir del programa...";
                    default: ESCRIBIR "Opción no contemplada";
                FINSEGUN
            FINPROCESO
        */
        
        int operacion = 0;
        int cantidad = 0;
        int total = 0;
        
        System.out.println("Seleccione operación:");
        System.out.println("1. Ingresar dinero.");
        System.out.println("2. Retirar dinero.");
        System.out.println("3. Consultar saldo.");
        System.out.println("4. Salir.");
        
        Scanner scan = new Scanner (System.in);
        operacion = scan.nextInt();
        
        switch (operacion)
        {
            case 1:
                System.out.print("Defina la cantidad a ingresar: ");
                cantidad = scan.nextInt();
                if (cantidad <=0)
                {
                    System.out.println("Error");
                } else {
                    total += cantidad;  // total = total + cantidad;
                    System.out.println("Operación realizada: " + total);
                }
            case 2:
                System.out.print("Defina la cantidad a retirar: ");
                cantidad = scan.nextInt();
                if (cantidad <=0)
                {
                    System.out.println("Error");
                } else {
                    if (cantidad > total)
                    {
                        System.out.println("No hay saldo suficiente");
                    } else
                    {
                        total -= cantidad;  // total = total - cantidad;
                        System.out.println("Operación realizada: " + total);
                    }
                }
            case 3:
                System.out.println("Cantidad: " + total);
            case 4:
                System.out.println("Salir del programa...");
            default:
                System.out.println("Opción no contemplada.");
        }
        
        /* ENUNCIADO: Solicita el tipo de producto ("alimentacion", "general", 
            "reducido") y calcula el precio final aplicando el IVA correspondiente (4%, 10%, 21%).
        */
        
        /* ENUNCIADO: Pide una nota entera (0–10) y clasifica el resultado:
            0–4 → Suspenso
            5 → Aprobado
            6 → Bien
            7–8 → Notable
            9–10 → Sobresaliente
        */

    }
    
}
