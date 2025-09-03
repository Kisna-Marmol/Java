public class PrimitivosCaracteres {
    public static void main(String[] args){
        var caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter"+(simbolo==caracter));

        System.out.println("tipo char correspondiente en bytes a "+   Character.BYTES);
        System.out.println("tipo char correspondiente en bits a "+ Character.SIZE);
        System.out.println("Valor maximo de un char: "+ Character.MAX_VALUE);
        System.out.println("Valor minimo de un char: "+ Character.MIN_VALUE);
    }
}
