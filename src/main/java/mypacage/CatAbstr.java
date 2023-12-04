package mypacage;

public class CatAbstr extends AnimalAbstract{
    @Override
    public void saySmth() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("I like milk");

    }
}
