public class PrimitivosEnteros {
    public static void main(String[] args){
        byte numerByte = 7;
        System.out.println("numeroByte = "+numerByte);
        System.out.println("tipo byte correspondiente en bytes a "+ Byte.BYTES);
        System.out.println("tipo byte correspondiente en bits a "+ Byte.SIZE);
        System.out.println("Valor maximo de una Byte: "+Byte.MAX_VALUE);
        System.out.println("Valor minimo de un Byte: "+ Byte.MIN_VALUE);

        System.out.println("=====================================================");

        short numeroShort = 32767;
        System.out.println("numeroShort = "+numeroShort);
        System.out.println("tipo short correspondiente en bytes a "+ Short.BYTES);
        System.out.println("tipo short correspondiente en bits a "+ Short.SIZE);
        System.out.println("Valor maximo de una Short: "+Short.MAX_VALUE);
        System.out.println("Valor minimo de un Short: "+ Short.MIN_VALUE);

        System.out.println("=====================================================");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = "+numeroInt);
        System.out.println("tipo Integer correspondiente en bytes a "+ Integer.BYTES);
        System.out.println("tipo Integer correspondiente en bits a "+ Integer.SIZE);
        System.out.println("Valor maximo de una Integer: "+Integer.MAX_VALUE);
        System.out.println("Valor minimo de un Integer: "+ Integer.MIN_VALUE);

        System.out.println("=====================================================");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = "+numeroLong);
        System.out.println("tipo Long correspondiente en bytes a "+ Long.BYTES);
        System.out.println("tipo Long correspondiente en bits a "+ Long.SIZE);
        System.out.println("Valor maximo de una Long: "+ Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long: "+ Long.MIN_VALUE);

        System.out.println("=====================================================");
    }
}
