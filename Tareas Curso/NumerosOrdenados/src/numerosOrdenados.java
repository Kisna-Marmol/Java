import java.util.Scanner;

public class numerosOrdenados {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.println("Ingrese un numero:");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero:");
        num2 = leer.nextInt();

        if(num1 > num2){
            System.out.println("Los numeros ordenados son: "+num1+" y "+num2);
        }else{
            System.out.println("Los numeros ordenados son: "+num2+" y "+num1);
        }
    }
}
