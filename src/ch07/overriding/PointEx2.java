package ch07.overriding;

public class PointEx2 {
    public static void main(String[] args) {
        Point3D2 p32 = new Point3D2();
        System.out.println("p32.x = " + p32.x);
        System.out.println("p32.y = " + p32.y);
        System.out.println("p32.z = " + p32.z);
    }
}

class Point2 {
    int x = 10;
    int y = 20;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point {
    int z = 30;

    Point3D2() {
        this(100, 200, 300);
    }
    Point3D2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}