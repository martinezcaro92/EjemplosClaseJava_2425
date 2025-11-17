/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251113;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner (System.in);

    
    public static void mostrarMenu() {
        System.out.println("===============================");
        System.out.println(" SISTEMA DE ACCESO IES RAMÓN ARCAS");
        System.out.println("===============================");
        System.out.println("1. Registrar entrada");
        System.out.println("2. Registrar salida");
        System.out.println("3. Buscar persona");
        System.out.println("4. Contabilizar personas");
        System.out.println("5. Salir");
        System.out.println();
    }
    
    public static int solicitarCodigoEstudiante ()
    {
        int aux;
        do {
            System.out.print("Introducir NRE: ");
            aux = scan.nextInt();
            if (aux<1 || aux>5)
            {
                System.out.println("Valor no válido. Vuelva a intentarlo.");
            }
        } while (aux<1 || aux>5);
        
        return aux;
    }
    
    public static boolean [] registrarEntrada(boolean [] estudiantes)
    {
        int est = solicitarCodigoEstudiante();
        if (estudiantes[est] == true)
        {
            System.out.println("El estudiante " + est + " ya se encuentra presente en el sistema.");
        }
        else 
        {
            System.out.println("Bienvenido estudiante " + est);
            estudiantes [est] = true;
        }
        return estudiantes;
    }
    
    public static boolean [] registrarSalida(boolean [] estudiantes)
    {
        int est = solicitarCodigoEstudiante();
        if (estudiantes[est] == false)
        {
            System.out.println("El estudiante " + est + " no se encuentra presente en el sistema.");
        }
        else 
        {
            System.out.println("Gracias por su visita estudiante " + est);
            estudiantes [est] = false;
        }
        return estudiantes;
    }
    
    public static void buscarEstudiante (boolean [] estudiantes)
    {
        int est = solicitarCodigoEstudiante();
        if (estudiantes[est] == true)
        {
            System.out.println("El estudiante está presente en el centro");
        }
        else
        {
            System.out.println("El estudiante no se encuentra en el centro");
        }
    }
    
    public static int contadorEstudiantes (boolean [] estudiantes)
    {
        int contador = 0;
        for (int i = 0; i<estudiantes.length; i++)
        {
            if (estudiantes[i]==true)
            {
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean [] estudiantes = new boolean[10];
        
        int opcion;

        do {
            mostrarMenu();
            System.out.println("Seleccione una opción: ");
            opcion = scan.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    estudiantes = registrarEntrada(estudiantes);
                    break;
                case 2:
                    estudiantes = registrarSalida(estudiantes);
                    break;
                case 3:
                    buscarEstudiante(estudiantes);
                    break;
                case 4:
                    int est = contadorEstudiantes(estudiantes);
                    System.out.println("El número de estudiantes presentes es: " + est);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            System.out.println();

        } while (opcion != 5);
    }
    
}
