import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double estado = 0.0;

        System.out.println("Ingrese el estado de la gasolina:");
        estado = leer.nextDouble();
        
        if (estado == 70.0){
            System.out.println("Estanque lleno");
        } else if (estado >= 60.0 && estado < 70.0) {
            System.out.println("Estanque casi lleno");
        } else if (estado >= 40.0 && estado < 60.0) {
            System.out.println("Estanque 3/4");
        } else if (estado >= 35.0 && estado < 40.0) {
            System.out.println("Medio estanque");
        } else if (estado >= 20.0 && estado < 35.0) {
            System.out.println("Suficiente");
        } else if (estado >= 1.0 && estado < 20.0) {
            System.out.println("Insuficente");
        }

    }
}