package ch07.polymorphism;

class CastingEx2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car;
        fe.drive(); //컴파일은 되는데 실행 시 에러 발생
        car2 = fe;
        car2.drive();
    }
}
