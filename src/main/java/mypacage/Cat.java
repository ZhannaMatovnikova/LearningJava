package mypacage;

public class Cat extends Animal{
    public void eat(String feed ){
        System.out.println("I like eating: " + feed);
    }
    @Override
    public void sound(){
        System.out.println("Meow meow meow");
    }
}
