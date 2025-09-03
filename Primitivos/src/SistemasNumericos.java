import javax.swing.JOptionPane;

public class SistemasNumericos {
    public static void main(String args[]){
        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un numero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERROR: Ingrese un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = "+Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero Octal  de " + numeroDecimal + " = "+Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero Hexadecimal de " + numeroDecimal + " = " +Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHexadecimal = 0x1e;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
