package ch06;

class CAR {
    String color;
    String gearType;
    int door;

    CAR() {
        this("white", "auto", 4);
    }

    CAR(String color) {
        this(color, "auto", 4);
    }

    CAR(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarEx2 {
    public static void main(String[] args) {
        CAR c1 = new CAR();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        CAR c2 = new CAR("blue");

        System.out.println("c1 의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2 의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

    }
}
