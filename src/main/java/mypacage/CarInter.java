package mypacage;

public class CarInter implements Transport, InterfaceTest{
    @Override
    public void go() {
        System.out.println("We are driving");
    }

    @Override
    public void stop() {
        System.out.println("We are driving slower!");

    }

    @Override
    public void method1() {
        System.out.println("test1");
    }

    @Override
    public void method2() {
        System.out.println("Test2");

    }
}
