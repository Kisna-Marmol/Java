public class PrimitivosFloat {
    public static void main(String[] args){
        float realFloat = 0.00000000015F;//1.5e-10F
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo Float correspondiente en bytes a "+ Float.BYTES);
        System.out.println("tipo Float correspondiente en bits a "+ Float.SIZE);
        System.out.println("Valor maximo de un Float: "+Float.MAX_VALUE);
        System.out.println("Valor minimo de un Float: "+ Float.MIN_VALUE);

        System.out.println("=====================================================");

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo Double correspondiente en bytes a "+ Double.BYTES);
        System.out.println("tipo Double correspondiente en bits a "+ Double.SIZE);
        System.out.println("Valor maximo de un Double: "+ Double.MAX_VALUE);
        System.out.println("Valor minimo de un Double "+ Double.MIN_VALUE);

        System.out.println("=====================================================");


    }
}

