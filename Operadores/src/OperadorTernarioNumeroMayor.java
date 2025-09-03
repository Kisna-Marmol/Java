import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0, max = 0;
        String result = "";

        System.out.println("Ingrese el primer numero:");
        num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = s.nextInt();
        System.out.println("Ingrese el tercer numero:");
        num3 = s.nextInt();

        max = (num1 > num2) ? num1: num2;
        max = (max > num3) ? max: num3;

        System.out.println("El numero mayor es = " + max);
    }
}
