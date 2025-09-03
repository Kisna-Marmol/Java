import java.util.Scanner;
public class DetalleDeFactura {
    public static void main(String []args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre o la descripcion de la factura");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el precio del primer producto");
        double p1 = leer.nextDouble();
        System.out.println("Ingrese el precio del segundo producto");
        double p2 = leer.nextDouble();

        double sumaSubTotal = p1 + p2;
        double imp = ((sumaSubTotal * 19)/100);
        double total = sumaSubTotal + imp;

        String mensaje = "La factura "+nombre+ "tiene un total bruto de "+sumaSubTotal;
        mensaje += ", con un impuesto de "+imp+" y el monto despues es de "+total;

        System.out.println(mensaje);
    }
}
