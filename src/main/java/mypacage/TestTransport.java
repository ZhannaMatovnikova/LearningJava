package mypacage;

public class TestTransport {
    public static void main(String[] args) {
        CarInter carInter = new CarInter();
        Plane plane = new Plane();

        carInter.go();
        carInter.stop();
        carInter.method1();
        carInter.method2();

        plane.go();
        plane.setSpeed(600);
        plane.stop();

    }
}
