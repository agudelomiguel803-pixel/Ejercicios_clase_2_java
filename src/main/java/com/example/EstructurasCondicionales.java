package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        
    }

    public static void ejemploIfElse() {
        float edad = 18;

       if(edad >= 18){
        System.out.println("Puedes votar");
       }
       else{
        System.out.println("No puedes votar");
       }
    }

    public static void ejemploIfElseIfElse() {
     
    }

    public static void ejemploSwitch() {
        int dia = 3; 
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Dia de la semana no válido");
        }
    }

    public static void ejemploSwitchExpression() {
        String estacion = "Verano";
        String resultado = switch (estacion) {
            case "Verano" -> "Sol y playa";
            case "Invierno" -> "Nieve y frío";
            case "Primavera" -> "Flores y clima templado";
            case "Otoño" -> "Hojas secas";
            default -> "Estación desconocida";
        };
        System.out.println("La estación es " + estacion + ": " + resultado);
    }
}