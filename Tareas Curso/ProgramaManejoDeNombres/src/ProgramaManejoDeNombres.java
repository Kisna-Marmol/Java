import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre");
        String nombre1 = leer.nextLine();
        String nombreS1 =  nombre1.toUpperCase().charAt(1)+"."+nombre1.substring(nombre1.length()-2);
        System.out.println("Ingrese el segundo nombre");
        String nombre2 = leer.nextLine();
        String nombreS2 =  nombre2.toUpperCase().charAt(1)+"."+nombre2.substring(nombre2.length()-2);
        System.out.println("Ingrese el tercer nombre");
        String nombre3 = leer.nextLine();
        String nombreS3 =  nombre3.toUpperCase().charAt(1)+"."+nombre3.substring(nombre3.length()-2);

        String result = nombreS1 + "_" + nombreS2 + "_"+nombreS3;
        System.out.println(result);
    }
}
