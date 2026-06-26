package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        double nota1 = 3.2 , nota2 = 4.5 , nota3 = 2.9;
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de notas es: " + promedio);
    }

    public static void demostrarIncrementoDecremento() {
        int n = 5;
        System.out.println("Valor normal de  n: " + n);
        System.out.println("Uso de n++ : " + (n++)); 
        System.out.println("Uso de ++n : " + (++n));
    }

    public static void demostrarRelacionales() {
            
    }

    public static void demostrarLogicos() {
        int numero = 25; 
        boolean Rango = (numero > 10 && numero < 50);
    }

    public static void demostrarAsignacionCompuesta() {
      
    }

    public static void demostrarOperadorTernario() {
       int valor = -10;
        String resultado = (valor >= 0) ? "Positivo" : "Negativo";
        System.out.println("El número es: " + resultado);
    }
}