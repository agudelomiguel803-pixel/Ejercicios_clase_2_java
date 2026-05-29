package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        int datos = 55;
        double conversion = datos;
        System.out.println(conversion);
    }

    public static void demostrarCastingExplicito() {
        double numeros = 2.8890;
        int conversion2 = (int) numeros;
        System.out.println(conversion2);
    }

    public static void demostrarProblemasDePrecision() {
        long numeroGrande = 70000;
        short conversion3 = (short)numeroGrande;
        System.out.println(conversion3);
    }
}