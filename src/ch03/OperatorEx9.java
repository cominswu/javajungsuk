package ch03;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a="+a); //int타입끼리의 연산결과는 int타입, 오버플로우생김
        System.out.println("b="+b);
    }
}
