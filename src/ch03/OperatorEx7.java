package ch03;

class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b);

        System.out.println(c); //300이 byte형 넘기때문에 데이터손실돼서 44가 젼수에 저장됨
    }
}
