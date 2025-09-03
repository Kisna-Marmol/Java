/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;


/**
 *
 * @author Kisna-Marmol
 */
import calculadura_clases.CalculadoraBasica;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalculadoraBasica calculadora = new CalculadoraBasica();
        
        
        System.out.println("Ingrese el primer numero:");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = scan.nextInt();
        
        calculadora.setNum1(num1);
        calculadora.setNum2(num2);
        
         // Mostrar los resultados de las operaciones
        System.out.println("Suma: " + calculadora.getSuma());
        System.out.println("Resta: " + calculadora.getResta());
        System.out.println("Multiplicación: " + calculadora.getMultiplicacion());
        System.out.println("División: " + calculadora.getDivision());
        System.out.println("Porcentaje (del primero respecto al segundo): " + calculadora.getPorcentaje() + "%");

        // Cerrar el Scanner
        scan.close();
    }
}
