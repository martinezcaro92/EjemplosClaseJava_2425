/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_xxxxxx.UT2;

/**
 *
 * @author josem
 */
public class MinMaxArray {
    public static void main(String[] args) {
        int a [] = {3,2,1,7,9};
        int max = a[0];
        int min = a[0];
        
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>max)
            {
                max = a[i];
            }
            if (a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("El valor max es: " + max);
        System.out.println("El valor min es: " + min);

    }
}
