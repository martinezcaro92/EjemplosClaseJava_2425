/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251205;

/**
 *
 * @author Jose Manuel
 */
public class Videojuegos {

    // Atributos
    private String titulo;
    private double tamanoGB;
    private int anoPublicacion;

    // Constructor vacío
    public Videojuegos() {
        this.titulo = "";
        this.tamanoGB = 0.0;
        this.anoPublicacion = 0;
    }

    // Constructor completo
    public Videojuegos(String titulo, double tamanoGB, int anoPublicacion) {
        this.titulo = titulo;
        this.tamanoGB = tamanoGB;
        this.anoPublicacion = anoPublicacion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTamanoGB() {
        return tamanoGB;
    }

    public void setTamanoGB(double tamanoGB) {
        this.tamanoGB = tamanoGB;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    // toString()
    @Override
    public String toString() {
        return "Videojuegos[" +
               "titulo='" + titulo + '\'' +
               ", tamanoGB=" + tamanoGB +
               ", anoPublicacion=" + anoPublicacion +
               ']';
    }

    // Antigüedad
    public int antiguedad() {
        // java.time.Year currentYear = java.time.Year.now();
        //return currentYear.getValue() - this.anoPublicacion;
        return 2025 - this.anoPublicacion;
    }

    // Verificación de espacio en un USB
    public boolean espacioDisponibleEnUSB(double capacidadUSB) {
        return capacidadUSB >= this.tamanoGB;
    }
}
