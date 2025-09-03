package ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null;

        System.out.println("Ingrese la fecha de nacimiento en formato: yyyy-MM-dd");
        try {
            fecha = format.parse(scan.next());
            //System.out.println("fecha = " + fecha);
            System.out.println("fecha de nacimiento = " + format.format(fecha));

            Date fechaActual = new Date();
            System.out.println("fecha de actual = " + format.format(fechaActual));

            long diferenciaMilisegundos = fechaActual.getTime() - fecha.getTime();

            int edad  = (int) (diferenciaMilisegundos / (1000 * 60 * 60 * 24 * 365.25));

            System.out.println("Su edad actual es: " + edad);

        } catch (ParseException e) {
            System.out.println("Fecha de nacimiento inválida: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
