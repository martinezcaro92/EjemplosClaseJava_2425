# Media10EstudiantesBasica.md
## Pseudocódigo: Media de 10 Estudiantes

En este pseudocódigo se describe el algoritmo necesario para calcular la nota media de una clase de 10 alumnos que se presentan a un examen.

---

## 📌 Pseudocódigo

```
INICIO
    DEFINIR total, nota, contador COMO ENTERO
    DEFINIR media COMO REAL
    total ← 0

    MIENTRAS contador MENOR 10 HACER
        ESCRIBIR "Introduzca nota: "
        LEER nota
        total ← total + nota
        contador ← contador +1 
    FIN PARA

    media ← (double) total / contador

    ESCRIBIR "La media de la clase es: ", media
FIN
```

---

## ✅ Descripción de pasos
1. Se inicializa la variable `suma` en 0 para acumular las notas.  
2. Se repite un ciclo **10 veces**, pidiendo al usuario cada nota.  
3. Cada nota se va sumando en `suma`.  
4. Al finalizar el ciclo, se divide la suma total entre 10 para calcular la media.  
5. Se muestra el resultado en pantalla.  

---
