package com.ejemplo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var mes = 0;
        var estacion = "Estacion desconocida";
        System.out.println("Ingrese el numero del mes de la estacion : ");
        Scanner entrada = new Scanner(System.in);
        mes = entrada.nextInt();

        switch (mes) {

            case 12:
            case 1:
            case 2:
                estacion = "Verano";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Otonio";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Invierno";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Primavera";
                break;
        }
        System.out.println("La estacion es : " + estacion);
    }
}


