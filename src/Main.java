public class    Main {
    public static void main(String[] args) {
        byte i = 10;
        short j = 100;
        int k = 1000;
        float f = 500.50f;
        long l = 1000;
        double d = 100000;

        char letter = 'a';
        boolean b = true;

        int number;
        float fval = 321111.35f;
        number = (int)fval;

        int number2;
        double dval = 32.35;
        number2 = (int)dval;
        System.out.println("Primitive Data Type !");
        System.out.println("1.Numeric Data Type !");
        System.out.println("byte i = " + i);
        System.out.println("shot j = " + j);
        System.out.println("int k = " + k);
        System.out.println("float F = " + f);
        System.out.println("long l = " + l);
        System.out.println("double d = " + d);

        System.out.println("2.Non-Numeric Data Type");
        System.out.println("char letter = " + letter);
        System.out.println("boolean b = " + b);

        System.out.println("3.Type Conversation (ind <-float)");
        System.out.println("(int)fval = " + number);
    }
}