import java.awt.*;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroString = "50";

        int numeroInt = Integer.parseInt(numeroString);
        System.out.println("numeroInt = " + numeroInt);

        String realString = "98765.43e-3";
        Double realDouble = Double.parseDouble(realString);
        System.out.println("realDouble = " + realDouble);

        String logicoString = "TruE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoString);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroString = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroString = " + otroNumeroString);

        otroNumeroString = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroString = " + otroNumeroString);

        double otroNumeroReal = 1.23456e2;
        String otroRealString = Double.toString(otroNumeroReal);
        System.out.println("otroRealString = " + otroRealString);

        otroRealString = String.valueOf(1.23456e2f);
        System.out.println("otroRealString = " + otroRealString);

        int i = 22768;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = (long) i;
        System.out.println("l = " + l);
        char c = (char) i;
        System.out.println("c = " + c);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
