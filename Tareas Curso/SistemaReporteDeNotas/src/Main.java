import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double notas = 0.0;
        double promedioNotaMayores = 0.0, promedioNotaMenores = 0.0, promedioNotaIgual = 0.0, promedioTotal = 0.0;
        double sumaMayores = 0.0, sumaInferior = 0.0, sumaTotal = 0.0;
        int contadorNotaMayores = 0, contadorNotaInferiores = 0, contadorNotaIgual = 0;
        int cantidad = 10;
        for (int i = 0; i < cantidad; i++){
            int k = i + 1;
            System.out.print("Ingrese la nota ["+k+"]: ");
            notas = scan.nextDouble();

            if (notas == 0){
                System.out.println("ERROR: Nota no aceptada");
                break;
            }

            if(notas > 5){
                sumaMayores += notas;
                contadorNotaMayores++;
            } else if (notas < 4) {
                sumaInferior += notas;
                contadorNotaInferiores++;
            }

            if (notas == 1) {
                contadorNotaIgual++;
            }
            sumaTotal += notas;
        }

        promedioNotaMayores = contadorNotaMayores > 0 ? sumaMayores / contadorNotaMayores : 0;
        promedioNotaMenores = contadorNotaInferiores > 0 ? sumaInferior / contadorNotaInferiores : 0;
        promedioTotal = sumaTotal / cantidad;

        System.out.println("PROMEDIOS:"+
                           "\nPromedio de notas mayores a 5: "+promedioNotaMayores+
                           "\nPromedio de notes inferiores a 4: "+promedioNotaMenores+
                           "\nPromedio de notas igual a 1: "+promedioNotaIgual+
                           "\nPromedio total: "+promedioTotal);

        scan.close();
    }
}