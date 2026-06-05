package ch07.overriding;

class PointEx {
    public static void main(String[] args) {

    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y); //없으면 오류

        this.x = x;
        this.y = y;
        this.z = z;
    }
    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}