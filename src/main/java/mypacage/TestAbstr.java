package mypacage;

public class TestAbstr {
    public static void main(String[] args) {
        DogAbstr dogAbstr = new DogAbstr();
        CatAbstr catAbstr = new CatAbstr();
        dogAbstr.walk("Park");
        dogAbstr.saySmth();

        catAbstr.walk("Backyard");
        catAbstr.eat();
    }
}
