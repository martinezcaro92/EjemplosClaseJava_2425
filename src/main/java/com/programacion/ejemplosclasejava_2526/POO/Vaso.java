/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class Vaso {

    /**
     * @param args the command line arguments
     */
    
    private String nombre;
    private String forma;
    private String color;
    private String material;
    private String dibujo;
    
    public Vaso(){
        
    }
    public Vaso (String nombre, String forma, String color, String material, String dibujo)
    {
        this.nombre = nombre;
        this.forma = forma;
        this.color = color;
        this.material = material;
        this.dibujo = dibujo;
    }
    
    public String toString(){
        return "Vaso[nombre=" + this.nombre + ", forma=" + this.forma + ", color=" + this.color + ", material="+this.material + ", dibujo=" + this.dibujo + "]";
    }
    
}
