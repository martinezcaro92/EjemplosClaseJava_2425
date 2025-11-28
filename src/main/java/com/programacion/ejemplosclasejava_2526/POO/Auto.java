/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class Auto {
    
    private String marca;
    private int cantidadPuertas;
    private String color;
    private int cilindrada;
    private double consumoCombustible;
    private int kilometrosRealizados;
    private double termostato;
    
    public Auto() {
        
    }
    
    public void encender(){
    
    }
    
    public void cambioRueda(){
        
    }
    
    public void combustibleConsumido(){
        
    }
    
    public void combustibleConsumidoPorMes(int pMes){
        
    }
    
    public void kilometrosRealizados (){
        
    }
    
    public void kilometrosRealizadosPorMes(int pMes) {
        
    }
    
    public double getTermostato (){
        return termostato;
    }
    
    public void setTermostato (double value){
        this.termostato = value;
    }
    
    /*private String marca;
    private int cantidadPuertas;
    private String color;
    private int cilindrada;
    private double consumoCombustible;
    private int kilometrosRealizados;
    private double termostato;*/
    
    public String toString ()
    {
        return "Auto[marca=" + this.marca + 
                        ", cantidadPuertas=" + this.cantidadPuertas + 
                        ", color="+this.color +
                        ", cilindrada=" + this.cilindrada +
                        ", consumoCombustible="+this.consumoCombustible +
                        ", kilometrosRealizados="+this.kilometrosRealizados +
                        ", termostato="+this.termostato + 
                        "]";
    }
    
}
