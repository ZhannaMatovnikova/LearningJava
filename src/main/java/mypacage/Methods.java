package mypacage;

public class Methods {
    public static void main(String[] args) {
        int result;
        result  = getSum(1,10);
        System.out.println(result);

        result = getSum(1,5,10);
        System.out.println(result);

        int [] array = {1, 22, 52, 34, 16};
        int sum = getSum(array, "Rita");


//        int a = 123;
//        int b = 3;
//        int sum;

//        sum = getSum(a,b);
//        System.out.println(sum);
//        sum = getSum(10, 50);
//        System.out.println(sum);
//
//        showSum(10, 51,77);
//
//        saySmth();
        sayHello("Petya", "Riya");
        sayHello();
//
//        showSumToPerson("Zhanna", 1,2,3);
//
//        boolean result = showSum(1,2, 5);
//        System.out.println(result);

    }
    static int getSum(int x, int y) {
        int sum;
        sum = x+y;
        return sum;
    }
    static int getSum(int x, int y, int z) {
        int sum;
        sum = x+y+z;
        return sum;
    }

    static int getSum(int [] array, String name) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("Hi "+ name + "!");
        System.out.println("Yoyr sum is: "+ sum);
        return sum;
    }
    static void showSum(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
    }
    static void saySmth() {
        System.out.println("Hello!");
        System.out.println("I'm running");
        System.out.println("You see me!");
    }

    static void sayHello(String name) {
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }

    static void sayHello(String name1, String name2) {
        System.out.println();
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }

    static void sayHello() {
        System.out.println();
        System.out.println("Hello!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }
    static void showSumToPerson(String name, int a, int b, int c) {
        System.out.println("Start of program!");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of program");
    }
// вернется boolean если создать метод
//    static boolean showSum(int x, int y, int z) {
//        int sum = x + y + z;
//        System.out.println("Sum is: " + sum);
//    }
}




/* Если метод ничего не должен вернуть, то void, если должен вернуть -
прописываем int, boolean и т д как в наименовании метода, указываем в скобках переменные
 в конце метода  - что вернуть (return true etc.)
 */