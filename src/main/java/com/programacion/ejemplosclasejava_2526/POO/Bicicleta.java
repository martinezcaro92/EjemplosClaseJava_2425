/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class Bicicleta {
    /*Definición de atributos*/ 
    private int revoluciones;
    private int pinonActual;
    private final String propietario;
    private double multiplicador [] = {2, 1.5, 1, 0.5, 0.3};
    
    /*Definición de métodos*/ 
    public void pedalear()
    {
        if (this.revoluciones == 0)
        {
            this.revoluciones = 1;
        } else{
            this.revoluciones *=2;
        }
    }
    
    public void frenar ()
    {
        this.revoluciones /= 2; 
    }
    
    public void cambiarPinon (int pinon)
    {
        this.pinonActual = pinon;
    }
    
    public void mostrarVelocidad ()
    {
        double velocidad = revoluciones  * multiplicador [pinonActual-1];
        System.out.println("La velocidad actual es: " + velocidad + ". El propietario es: " + propietario);
    }
    
    public String getPropietario()
    {
        return this.propietario;
    }
    
    public double obtenerVelocidad()
    {
        return revoluciones  * multiplicador [pinonActual-1];
    }
    
    /*Definición de constructor*/ 
    public Bicicleta (String propietario)
    {
        this.revoluciones = 0;
        this.pinonActual = 3;
        this.propietario = propietario;
    }
    
    /*Constructor completo, pero el enunciado no lo pide*/
//    public Bicicleta (int revoluciones, int pinonActual) 
//    {
//        this.revoluciones = revoluciones;
//        this.pinonActual = pinonActual;
//    }
    
    public static void main(String[] args) {
        /*Crea dos objetos de la clase bicicleta: miBicicleta y tuBicicleta */
        Bicicleta miBicicleta = new Bicicleta ("JoseM");
        Bicicleta tuBicicleta = new Bicicleta ("Pepe");
        
        /*Pedalea dos veces con miBici y cambia al piñón 2. */
        miBicicleta.pedalear();
        miBicicleta.pedalear();
        miBicicleta.cambiarPinon(2);
        
        /* Pedalea tres veces con tuBici y cambia al piñón 6.*/
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.cambiarPinon(6);
        
        /* Pedalea tres veces con tuBici y cambia al piñón 5.*/
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.cambiarPinon(5);
        
        /*Muestra ambas velocidades (método mostrarVelocidad()*/
        System.out.println("Uso del método mostrarVelocidad()");
        miBicicleta.mostrarVelocidad();
        tuBicicleta.mostrarVelocidad();
        System.out.println("");
        
        /*Muestra ambas velocidades (método obtenerVelocidad()*/
        System.out.println("Uso del método obtenerVelocidad()");
        System.out.println("La velocidad de miBicicleta es: " + miBicicleta.obtenerVelocidad() + ". El propietario es: " + miBicicleta.getPropietario());
        System.out.println("La velocidad de tuBicicleta es: " + tuBicicleta.obtenerVelocidad() + ". El propietario es: " + tuBicicleta.getPropietario());

    }
}
