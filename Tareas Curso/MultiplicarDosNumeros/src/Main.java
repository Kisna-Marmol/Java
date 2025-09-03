import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.print("Ingrese el primer numero: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = scan.nextInt();

        int signo = (num1 < 0 && num2 < 0) || (num1 > 0 && num2 > 0) ? 1 : -1;

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);


        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        resultado *= signo;

        System.out.println("El resultado de la multiplicación es: " + resultado);

        scan.close();
    }
}