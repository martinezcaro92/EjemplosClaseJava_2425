/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251205;

/**
 *
 * @author joseM
 */
public class Rectangulo {

    private double base;
    private double altura;

    // Constructor vacío
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Constructor con parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Área (según enunciado: base*altura/2)
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Perímetro (2*base + 2*altura)
    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    // Getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

