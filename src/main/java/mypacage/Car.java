package mypacage;

public class Car {
   final static int var = 10; //статичная переменная static,
    // final - не может переопределять в другом классе
    static void method() { //статичный метод
        System.out.println("Static method");
    }

    public Car() {
        System.out.println("New car created!");
    }

    public Car(String color){
        this.color = color;
    }

    public Car(String color, int height, int width, int length){

        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;

    }

    int height;
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight(int weight) {
        this.weight +=weight;
        System.out.println("New weight = " + this.weight);

    }
     public void drive(int speed) {
         if (weight<= maxWeight) {
             this.speed =speed;
             System.out.println("We are driving!");
         } else {
             System.out.println("Can't drive");
         }

     }

 }
