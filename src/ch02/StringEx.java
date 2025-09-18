package ch02;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va"; //덧셈연산자로 문자열 결합 가능
        String str = name + 21;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);
    }
}