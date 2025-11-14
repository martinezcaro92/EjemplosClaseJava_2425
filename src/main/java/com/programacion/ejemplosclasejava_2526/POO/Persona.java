/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class Persona {
    private int DNI;
    private String nombre;
    private String apellido;
    private String direccion;
    
    public Persona (){
        
    }
    public Persona (int DNI, String nombre, 
                    String apellido, String direccion){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
