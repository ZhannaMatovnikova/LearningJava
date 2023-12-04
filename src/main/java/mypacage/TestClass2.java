package mypacage;// кошка и собака

public class TestClass2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Pussy";
        dog.name = "Sharik";

        cat.color = "White";
        dog.color = "Black";


        cat.walk("Backyard");
        dog.walk("Park");

        cat.eat("Milk");
        dog.sit();

        System.out.println("Cat's name is: "+ cat.name);
        System.out.println("Dog's name is: " + dog.name);

        dog.var = 10;
        System.out.println(dog.getWeight());

        dog.sound();
        cat.sound();
    }
}
