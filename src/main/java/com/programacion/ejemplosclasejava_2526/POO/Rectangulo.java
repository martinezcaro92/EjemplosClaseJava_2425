/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class Rectangulo {
    
    private int coordenadaSuperiorIzquierda [] = new int [2];
    private int coordenadaInferiorDerecha [] = new int [2];
    private String tipoDeLinea;
    private String colorDeLinea;
    private String colorDeRelleno;
    
    public Rectangulo (){}
    public void mostrarse (){
        
    }
    
    public void ocultarse () {
        
    }
    
    public void cambiarDePosicion (){
        
    }
    
    /*private int coordenadaSuperiorIzquierda [] = new int [2];
    private int coordenadaInferiorDerecha [] = new int [2];
    private String tipoDeLinea;
    private String colorDeLinea;
    private String colorDeRelleno;*/
    
    /*Este método toString es más complejo de los que se han visto previamente porque
        contienen variables de tipo Array. Se realiza un bucle for por cada uno de ellos
        para recorrer todas sus posiciones y registrar la información que contienen*/
    public String toString(){
        String izqSup = "(";
        for (int i = 0; i<coordenadaSuperiorIzquierda.length;i++){
            izqSup += coordenadaSuperiorIzquierda[i];
            if (i==coordenadaSuperiorIzquierda.length-1){
                izqSup +=")";
            } else {
                izqSup +=", ";
            }
        }
        String derInf = "(";
        for (int i = 0; i<coordenadaInferiorDerecha.length;i++){
            derInf += coordenadaInferiorDerecha[i];
            if (i==coordenadaInferiorDerecha.length-1){
                derInf +=")";
            } else {
                derInf +=", ";
            }
        }
        return "Rectangulo[coordenadaSuperiorIzquierda=" + izqSup +
                            ", coordenadaInferiorDerecha=" + derInf + 
                            ", tipoDeLinea=" + this.tipoDeLinea +
                            ", colorDeLinea=" + this.colorDeLinea +
                            ", colorDeRelleno=" + this.colorDeRelleno +
                            "]";
    }
}
