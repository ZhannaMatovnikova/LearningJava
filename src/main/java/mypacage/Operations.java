package mypacage;

public class Operations {
    public static void main(String[] args) {
        int a;
        a = 10;
        a =20;
        System.out.println(a);

        int b = a;
        System.out.println(b);
        int c, d;
        c = d = b;
        System.out.println(c + " " + d);
        System.out.println();
        a =13;
        b =5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println();
        System.out.println();
        double e = 15;
        double f = 7;
        System.out.println(e/f);
        System.out.println();

        System.out.println(a%b);
        a =b+c*d;
        System.out.println(a);
        System.out.println();

        a = (b+c)*d;
        System.out.println(a);
        a=15;
        b = 10;
        System.out.println();
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println();
        System.out.println(a-5>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println();
        System.out.println(a+10<=b+15);
        System.out.println(!(a+10<=b+15));
        System.out.println(!false);


        int i = 0;
        i++; //i = i+1
        System.out.println(i);

        i--; //i = i-1
        System.out.println(i);

        i=5;
        System.out.println(i++); //выводится 5
        System.out.println(i); //выводится 6
        i=3;
        a=i++;
        System.out.println(a); // print 3
        i=3;
        a=++i;
        System.out.println(a); //print 4
        System.out.println();
        a=10;
        b=20;
        System.out.println(a > b || a < b);
        System.out.println(a>b || b>30);
        System.out.println(a>b && a<b);
        System.out.println(a>9 && b==20);
        System.out.println(!((a+10>15 || b-5>10) && a<b));
        a = 9;
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a,3));

        a=10;
        a=a+5;
        System.out.println(a);
        System.out.println();


        a=10;
        a+=5;
        System.out.println(a);
        a-=5;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a%=3; //a = a%3
        System.out.println(a);









    }
}
