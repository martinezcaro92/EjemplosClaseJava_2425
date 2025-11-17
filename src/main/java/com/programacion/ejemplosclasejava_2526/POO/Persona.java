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
    /* Al trabajar con Programación Orientada a Objetos (POO) cambia el  paradigma
        de programación y ya no hacemos la ejecución de nuestro código directemente
        en un main. Ahora se definen los atributos y los métodos dentro de una clase
        y se emplearán los métodos main para hacer las pruebas pertinentes.
    */
    
    // En primer lugar, se definen los atributos GLOBALES que conforman un objeto
    private int DNI;
    private String nombre;
    private String apellido;
    private String direccion;
    
    /* Para poder instanciar un objeto es necesario que existan unos métodos especiales
        llamados constructores. Estos métodos son especiales porque no devuelven
        ningún tipo de dato. SIEMPRE van a tomar el mismo nombre que la clase
        
    Puede haber POLIMORFISMO. Donde se definan varios constructores o métodos con 
        el mismo nombre pero que tomen diferentes atributos de entrada.
    */
    
    public Persona (){
        // Se trata de un constructor vacío que no inicializa ninguna variable
    }
    public Persona (int DNI, String nombre, 
                    String apellido, String direccion){
        // Se trata de un constructor completo, donde se toman como argumento 
        // valores para todas los atributos definidos en la clase
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    
    // Se definen los métodos getter y setter para cada una de los atributos 
    // previamente definidos
    
    // Método getter, no toma nada como argumento y el tipo de datos que devuelve, 
    // coincide con el tipo de dato del argumento con el que está trabajando
    public int getDNI() {
        return DNI;
    }
    
    // Método setter, toma el valor nuevo a fijar como argumento y no retorna 
    // ningún valor, ya que lo que hace en el cuerpo del método es fijar el nuevo
    // valor a la variable global definida al inicio de la clase.
    public void setDNI(int DNI) {
        //this.variable se refiere a la varible global.
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
    
    /* Esta clase no contiene un método main. Por lo tanto, en la POO no es 
        obligatorio el uso de métodos main en todas las clases
    */
}
