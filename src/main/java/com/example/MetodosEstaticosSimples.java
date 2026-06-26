package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("==============================");
        System.out.println("   BIENVENIDO A LA TAREA DE JAVA!      ");
        System.out.println("==============================");
    }


    public static void ejemploPasoParametros(String nombre) {
        String saludo = "Estimado/a " + nombre + ", es un placer saludarle.";
        System.out.println(saludo);
    }

    public static int ejemploRetornoValores() {
        // TODO
        return 0;
    }

    public static void ejemploSobrecarga() {
        double lado = 5;
        double area = lado * lado;
        System.out.println("Área del cuadrado: " + area);
    }

    public static void ejemploSobrecarga(int n) {
        // TODO
    }
}