public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);

        System.out.println("tipo byte corresponde en byte a "+ Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a "+ Byte.SIZE);
        System.out.println("Valor máximo de un byte = " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte = "+ Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroByte = " + numeroShort);

        System.out.println("tipo short corresponde en byte a "+ Short.BYTES);
        System.out.println("tipo short corresponde en bites a "+ Short.SIZE);
        System.out.println("Valor máximo de un short = " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short = "+ Short.MIN_VALUE);

        int numeroInt = 3728;
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("tipo int corresponde en byte a "+ Integer.BYTES);
        System.out.println("tipo int corresponde en bites a "+ Integer.SIZE);
        System.out.println("Valor máximo de un int = "+ Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int = "+ Integer.MIN_VALUE);

        long numeroLong = 2547189;
        System.out.println("numeroLong = " + numeroLong);
        
        System.out.println("tipo long corresponde en byte a "+ Long.BYTES);
        System.out.println("tipo long corresponde en bites a "+ Long.SIZE);
        System.out.println("Valor máximo de un long = "+ Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long = "+ Long.MIN_VALUE);
        
        var numeroVar = 2145879625;
    }
}
