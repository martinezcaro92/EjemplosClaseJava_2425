/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251205;

/**
 *
 * @author Jose Manuel
 */
public class TestingPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // --------- a) Crear dos objetos Videojuego ----------
        Videojuegos v1 = new Videojuegos("EA Sport FC 26", 55.0, 2025);
        Videojuegos v2 = new Videojuegos("Fornite", 40.0, 2017);

        // --------- b) Guardar los videojuegos en un array ----------
        Videojuegos[] listaVideojuegos = { v1, v2 };

        // --------- c) Mostrar por pantalla el toString() ----------
        System.out.println("=== VIDEOJUEGOS ===");
//        for (Videojuegos v : listaVideojuegos) {
//            System.out.println(v.toString());
//        }
        for (int i = 0 ; i< listaVideojuegos.length; i++)
        {
            System.out.println(listaVideojuegos[i].toString());
        }

        // --------- d) Crear cuatro objetos Planta con datos reales ----------
        Planta p1 = new Planta("Aloe barbadensis miller", "Aloe Vera", 0.3, true);
        Planta p2 = new Planta("Lavandula angustifolia", "Lavanda", 0.45, true);
        Planta p3 = new Planta("Epipremnum aureum", "Poto", 0.5, false);
        Planta p4 = new Planta("Echinopsis pachanoi", "Cactus", 0.2, true);

        // --------- e) Guardarlas en un array ----------
        Planta[] listaPlantas = { p1, p2, p3, p4 };

        // --------- f) Regar cada planta y mostrar humedad actualizada ----------
        System.out.println("=== PLANTAS ===");
        //for (Planta p : listaPlantas) {
        for (int i = 0 ; i< listaPlantas.length; i++) {
            listaPlantas[i].regar(2.0);  // se aportan 2 litros de agua
            System.out.println("Humedad actual de " + listaPlantas[i].getNombreComun() + ": " + listaPlantas[i].getHumedadSuelo());
        }

        // --------- g) Crear un Rectangulo y mostrar el área ----------
        Rectangulo r1 = new Rectangulo(2, 5);
        System.out.println("Área del rectángulo r1: " + r1.calcularArea());

        // --------- h) Crear otro Rectangulo y mostrar el perímetro ----------
        Rectangulo r2 = new Rectangulo(2, 5);
        System.out.println("Perímetro del rectángulo r2: " + r2.calcularPerimetro());
    }
    
}
