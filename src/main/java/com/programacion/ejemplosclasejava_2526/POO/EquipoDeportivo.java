/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class EquipoDeportivo {
    // Se definen los atributos (variable global)
    private String nombre;
    
    // Se definen los constructores 
    // Constructor por defecto
    public EquipoDeportivo(){}
    
    // Constructor completo
    public EquipoDeportivo(String nombre) {
        this.nombre = nombre;
    }

    // Se definen los métodos
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre (){
        return nombre;
    }
    
}
