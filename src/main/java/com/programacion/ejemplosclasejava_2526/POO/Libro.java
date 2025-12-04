/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.POO;

/**
 *
 * @author josem
 */
public class Libro {
    //Atributos
    private String isbn;
    private String autor;
    private String titulo;
    private int anio;
    
    public Libro (String titulo, String autor, int anio)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    
    public Libro (String isbn, String titulo, String autor, int anio)
    {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    
    public String getIsbn()
    {
        return isbn;
    }
    public void setIsbn(String value)
    {
        this.isbn = value;
    }
    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    public String getAutor()
    {
        return autor;
    }
    public void setAutor (String autor) {this.autor=autor;}
    public int getAnio() {return anio;}
    public void setAnio(int anio){this.anio = anio;}
    
    public String citaBibliografica()
    {
        if (isbn == null){
            return "Libro[" + this.titulo + ", "+ this.autor + ", " + this.anio + ", no tiene ISBN]" ;
        } else {
            return "Libro[" + this.titulo + ", "+ this.autor + ", " + this.anio + ", " + this.isbn +"]" ;
        }
        // Para toString
        //return "Libro[" + this.titulo + ", "+ this.autor + ", " + this.anio + ", " + this.isbn +"]"
    }
}
