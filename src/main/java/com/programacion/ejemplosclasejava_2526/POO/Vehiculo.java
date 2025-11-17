/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class Vehiculo {
    // Aquí se definen las variables
    private String matricula;
    private String marca;
    private int cilindrada;
    private String color;
    private int ruedas;
    private String modelo;
    
    // Aquí dejamos pendiente los constructores
    public Vehiculo () {}
    public Vehiculo (String matricula, String marca, int cilindrada, 
                        String color, int ruedas, String modelo) {
        
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.color = color;
        this.ruedas = ruedas;
        this.modelo = modelo;
    }
    
    // Aquí ponemos los getter y los setter
    public String getMatricula (){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMarca () {
        return marca;
    }
    
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public int getCilindrada () {
        return cilindrada;
    }
    
    public void setCilindrada (int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor (String color){
        this.color = color;
    }
    
    public int getRuedas (){
        return ruedas;
    }
    
    public void setRuedas (int ruedas) {
        this.ruedas = ruedas;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
}
