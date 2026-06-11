package ch07.polymorphism;

public class CastingEx {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        //car.water();  오류발생
        fe2 = (FireEngine)car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, brrrr");
    }
    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water~~");
    }
}