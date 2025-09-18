package ch02;

public class PrintfEx {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010; //8진수 접두사
        int hexNum = 0x10; //16진수 접두사
        int binNum = 0b10; //2진수 접두사

        System.out.printf("b=%d%n" , b); //%d는 10진 형식으로 출력 %n은 줄바꿈
        System.out.printf("s=%d%n" , s);
        System.out.printf("c=%c, %d %n" , c , (int)c); //int타입으로 형젼환
        System.out.printf("finger=[%5d]%n" , finger);
        System.out.printf("finger=[%-5d]%n" , finger); //왼쪽정렬
        System.out.printf("finger=[%05d]%n" , finger);
        System.out.printf("big=%d%n" , big);
        System.out.printf("hex=%#x%n" , hex); //'#'은 접두사
        System.out.printf("octNum=%o , %d%n" , octNum , octNum);
        System.out.printf("hexNum=%x , %d%n" , hexNum , hexNum);
        System.out.printf("binNum=%s , %d%n" , Integer.toBinaryString(binNum) , binNum); //정수를 2진수로 변환해서 문자열로 반환
    }
}