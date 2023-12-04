package mypacage;
public class Dog extends Animal{
    private int weight = 2;
    private int var2;

    public int getWeight() { //пользователь может обратиться к переменной и узнать ее значение
        return weight;
    }
//
//    public void setWeight(int weight) { //пользователь может обратиться к переменной и изменить ее
//        this.weight = weight;
//    }

    public void sit(){
        System.out.println("I'm sitting");
        var = 20;
    }
    public void lay(){
        System.out.println("I'm laying");
    }
}
