package mypacage;

public class DogAbstr extends AnimalAbstract{
    @Override
    public void saySmth() {
        System.out.println("WOW WOW");
    }

    @Override
    public void eat() {
        System.out.println("I like meat");
    }
    public void sit(){
        System.out.println("I'm sitting");
    }
}
