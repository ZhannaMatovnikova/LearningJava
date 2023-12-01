package mypacage;

public class Exceptions {
    public static void main(String[] args) {
        devide(10, 0);
      try {
          devide1(10,2);
      } catch (ArithmeticException e) {
          e.printStackTrace();
      }
    }

    public static void devide1(int a, int b) throws ArithmeticException {
        if (b==0) {
            throw new ArithmeticException("Can't devide by zero!");
        } else {
            System.out.println("Result is: "+ a/b);
        }

    }



    public static void devide(int a, int b) {
        try {
            System.out.println("Result is: "+ a/b);
        } catch (ArithmeticException e) {
            System.out.println("Problem!");
//        } catch (ArrayIndexOutOfBoundsException) {
//        }
        }
        finally {
            System.out.println("Finish!");
        }
        }


}
