package Ejercicios;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el radio de un circulo = ");
        double radio = scan.nextDouble();

        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area del circulo es = "+area);
    }
}
