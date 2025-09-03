import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date fecha = null;

        System.out.println("Ingrese una fecha con formato: yyyy-MM-dd");
        try {
            fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));


            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2)){
                System.out.println("fecha 1 (del usuario) es despues de fecha 2 (actual)");
            }else if (fecha.before(fecha2)){
                System.out.println("fecha es anterior a fecha 2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha es igual a fecha 2");
            }

            if (fecha.compareTo(fecha2) > 0){
                System.out.println("fecha 1 (del usuario) es despues de fecha 2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha es anterior a fecha 2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha es igual a fecha 2");
            }
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
