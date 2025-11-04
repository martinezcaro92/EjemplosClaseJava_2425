/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion.ejemplosclasejava_2526.Metodos;

/**
 *
 * @author josem
 */
public class Teoria {

        /* TEORÍA DE MÉTODOS
            Definición: Bloque de código que desarrolla una función específica
            IMPORTANTE: El método main es el método principal de una clase
                        Ejecuta las instrucciones de forma secuencial.
                          --> La ejecución peude no seguirse de forma estrictamente
                              secuencial al hacer uso de:
                                - Estructuras de control
                                - Bucles
                                - Métodos
        
        */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            - public: Determina la visibilidad/privacidad del método
            - static: Identifica si el método/variable pertenece a la clase o 
                        al objeto
            - void: tipo de dato que devuelve, en este caso puede no devolver nada.
            - main: nombre del método
            - (): Es obligatorio el uso de paréntesis. Puede incluir o no argumentos
                * Ej: (String[] args)
        */
        //int respuesta = sumar(8,4);
        //System.out.println(respuesta);
        
        //System.out.println(sumar(8, 4) + sumar(5, 7) );
        System.out.println(sumar(sumar(8, 4), sumar(5, 7))); // Llamada a métodos 
                                                             // de forma recursiva
        System.out.println(restar(5, 6));
        
        System.out.println(sumar(restar(4,7),sumar(5,9)));
        
        System.out.println(cabecera());
        
        /*
        Tanto para la definición como para la llamada del método es importante
        hacer uso de los paréntesis aunque no tome ningún argumento
        */
        cabecera2();
        
        System.out.println(cabecera3());    // Imprime el System.out.println y 
                                            // lo que devuelve (return) el método
        System.out.println("");
        cabecera3();    //Sólo imprime el System.out.println que hay dentro
        
        
        System.out.println("");
        saludo("Dieguito");
        saludo("Pedrito");
        
        
    }
    
    /* A la pregunta de, ¿se pueden definir dos métodos con el mismo nombre?
        La respuesta es SI y se debe al POLIMORFISMO.
    */
    public static double sumar (double A, double B)  // CABECERA DEL MÉTODO
    {                                       // A PARTIR DE AQUÍ CUERPO DEL MÉTODO
        return A+B;
    }
    public static int sumar (int A, int B, int C)  // CABECERA DEL MÉTODO
    {                                       // A PARTIR DE AQUÍ CUERPO DEL MÉTODO
        return A+B+C;
    }
    
    public static int sumar (int A, int B)  // CABECERA DEL MÉTODO
    {                                       // A PARTIR DE AQUÍ CUERPO DEL MÉTODO
        return A+B;
        // int aux = A+B;
        // return aux;      //Esta solución también sería válida pero menos
                            // eficiente
        //return "Hola soy Pepito"; //Esto no sería correcto porque el tipo de dato
                                    // devuelto no coincide
    }
    
    public static int restar (int A, int B)
    {
        return A-B;
    }
    
    public static String cabecera()
    {
        return "Hola Pepito";
    }
    
    public static void cabecera2()
    {
        System.out.println("Hola Manolito");
    }
    
    public static String cabecera3()
    {
        System.out.println("Hola Miguelito");
        return "Hola Juanito";
        //System.out.println("Hola Ramona");
        /*
        El return es la escapatoria del método que se define. Todo lo definido
        debajo del return no será ejecutado
        */
    }
    public static void saludo (String nombre)
    {
        System.out.println("Hola " + nombre);
    }
}
