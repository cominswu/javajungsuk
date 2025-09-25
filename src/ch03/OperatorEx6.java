package ch03;

class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); //형변환안하면 에러

        System.out.println(c);
    }
}
