/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Repasos.PrevUT3;

/**
 *
 * @author josem
 */
public class SumaCondicionada {

    /**
     * Se definen en un array unidimensional las distancias alcanzadas en el campeonato
     * de lanzamiento de hueso de oliva. Estos lanzamientos pueden ser válidos o no
     * (lanzamientos 1, 4 y 5 no son válidos). Realizar la suma de el alcance
     * de todos los lanzamientos y obtener el jugador (con lanzamiento válido)
     * que alcanzó la distancia máxima (y su distancia alcanzada).
     */
    public static void main(String[] args) {
        double lanzamientos [] = {5.2, 3.7, 2.1, 0.4, 3.4, 2.8, 7.1, 4.6};
        boolean validacion [] = {false, true, true, true, false, false, true, true};
        double sumaTotal = 0;
        double distMax = Integer.MIN_VALUE;
        
        for (int i = 0; i<lanzamientos.length; i++)
        {
            if (validacion[i] == true)
            {
                sumaTotal = sumaTotal + lanzamientos[i];
                if (distMax < lanzamientos[i])
                {
                    distMax = lanzamientos[i];
                }
            }

        }
    }
    
}
