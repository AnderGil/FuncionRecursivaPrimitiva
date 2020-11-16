package com.company;

import java.util.Scanner;

public class Main {

    private static int funcionNula(int x) {
        return 0;
    }
    private static int funcionSucesor(int x) {
        return x + 1;
    }

    private static int potencia(int x, int y) {
        if (y == 0) {
            return funcionSucesor(funcionNula(x));
        } else {
            return potencia(x, y - 1) * y;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce el numero x:");
            int x = sc.nextInt();
            System.out.println("Introduce el numero y:");
            int y = sc.nextInt();
            if (x < 0 || y < 0) {
                throw new Exception("Las funciones recursivas primitivas solo estan definidas para los numeros naturales");
            }

            int resultado = potencia(x, y);
            System.out.println("Resultado de la potencia: " + resultado);
        } catch (Exception e) {
            throw new Exception("Error. Introduce numeros");
        }

    }
}
