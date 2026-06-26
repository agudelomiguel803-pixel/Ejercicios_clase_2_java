package com.example;

public class EstructurasDeRepeticion {

    public static void ejemploWhile() {
        int i = 10;
        while (i >= 1) {
            System.out.println("Cuenta: " + i);
            i--;
        }
    } 

    public static void ejemploDoWhile() {
        int numero = 0;
        // toco asi profe porque no podemos usar el sccaner
        do {
            System.out.println("Escribe un número 0 para salir: " + numero);
         
        } while (numero != 0);
    }

    public static void ejemploForClasico() {
        
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j));
            }
            
        }
    }

   public static void ejemploBreakContinue() {
    for (int i = 1; i <= 10; i++) {
        if (i == 7) {
            System.out.println("Número 7 encontrado "); 
            break; 
        }
        System.out.println("Número actual: " + i); 
    }
}

    public static void ejemploEtiquetas() {
       
    }
} 