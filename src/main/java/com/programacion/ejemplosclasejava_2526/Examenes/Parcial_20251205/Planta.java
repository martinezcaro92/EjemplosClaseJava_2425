/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Examenes.Parcial_20251205;

/**
 *
 * @author joseM
 */
public class Planta {

    private String nombreCientifico;
    private String nombreComun;
    private double humedadSuelo;
    protected boolean necesitaLuz;

    public Planta() {}

    public Planta(String nombreCientifico, String nombreComun, double humedadSuelo, boolean necesitaLuz)     
    {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.humedadSuelo = humedadSuelo;
        this.necesitaLuz = necesitaLuz;
    }

    public void regar(double cantidadLitros) {
        if (cantidadLitros > 0) {
            double incremento = cantidadLitros * 0.10;
            humedadSuelo += incremento;
        }
    }

    public String getNombreCientifico() {return nombreCientifico;}

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() { return nombreComun;}

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public double getHumedadSuelo() {return humedadSuelo;}

    public void setHumedadSuelo(double humedadSuelo) {
        this.humedadSuelo = humedadSuelo;
    }

    public boolean isNecesitaLuz() { return necesitaLuz; }

    public void setNecesitaLuz(boolean necesitaLuz) {
        this.necesitaLuz = necesitaLuz;
    }
}

