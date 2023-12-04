package mypacage;

public class Animal {
    String name;
    String color;
    int var;// public - можем обращаться к переменной везде, private - только в данном файле;
    //protected можем обращаться к переменной в рамках одного package или если есть наследование extends
// без указания перед переменной public/p/p можем пользоваться только внутри package
    public void walk(String place) {
        System.out.println("We are walking here: " + place);
        var = 10;
    }
    public void sleep(){
        System.out.println("Zzzz");
    }

    public void sound(){
        System.out.println("Hello!");
    }
}
