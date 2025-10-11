/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.UT2;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class PorcentajeEstudiantes
{
    public static void main (String [] args)
    {   
        int hombres, mujeres, total;
        double por_hombres, por_mujeres;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Introduzca el número de mujeres: ");
        mujeres = scan.nextInt();
        
        System.out.print("Introduzca el número de hombres: ");
        hombres = scan.nextInt();
        
        total = mujeres + hombres;
        
        por_mujeres = (double)(mujeres*100)/total;
        por_hombres = (double)(hombres*100)/total;
        
        System.out.println("El "+por_mujeres+"% son mujeres, y el " + por_hombres + "% son hombres");
        
//        System.out.println("El " + 100*mujeres/(mujeres+hombres) + "% son mujeres, y el " +
//                (hombres*100)/(mujeres+hombres) + "% son hombres");
    }
}
