package mypacage;

public class TestClass {
    public static void main(String[] args) { // модификатор static позволяет хранить переменную и метод в ед экземпляре в классе
//        System.out.print("Hello world! ");
//        System.out.println("It's my first program");
//        System.out.println("Good bye!");

        Car car1 = new Car();
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);
        Car car2 = new Car();
        car2.color = "White";
        Car car3 = new Car();
        car3.color = "Yellow";

        car2.drive(100);
        car3.drive(150);

        Car car4 = new Car("Black");

        System.out.println("Car color is: "+ car4.color);

        Car car5 = new Car("Red", 2100, 2000, 5100);
        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.length);

        Food pizza = new Food("Carbonara", 500);
        System.out.println(pizza.dish);

        System.out.println(pizza.price);

        pizza.MenuPrice(pizza.price);

        System.out.println(Car.var);
//         Car.var = 100;
        System.out.println(car1.var);
        System.out.println(car2.var);
        System.out.println(car3.var);


        Car.method();

        String.format("New \s string", "sting");






    }
}
