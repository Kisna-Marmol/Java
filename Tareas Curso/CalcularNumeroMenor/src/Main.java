
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a comparar (mínimo 10): ");
        int cantidad = scan.nextInt();

        if (cantidad < 10) {
            System.out.println("Debe ingresar al menos 10 números.");
            return;
        }

        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scan.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El número menor es: " + menor);

        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

        scan.close();
    }
}