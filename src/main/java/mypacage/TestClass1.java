package mypacage;

public class TestClass1 {
    public static void main(String[] args) {
        byte a = 5; //-128 127
        short b = -100; //-32768 32767
        int c = 1000000; //
        long d = 123456789; //

        /*

        hfghfj
         */
        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        double d1 = 123.98;
        System.out.println();
        System.out.println(d1);
        float f1 = 123.56f;
        System.out.println(f1);

        boolean boolean1 = true;
        System.out.println("boolean1 = " + boolean1);
        boolean boolean2 = false;
        System.out.println("boolean2 = "+ boolean2);

        boolean boolean3 = (1+2)>0;
        boolean boolean4 = (1+2)>5;
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello";
        System.out.println(str);
        String str1 = "World";
        String str2 = str + " "+ str1;
        System.out.println(str2);

        char char1 = '1';
        System.out.println(char1);

    }
}
