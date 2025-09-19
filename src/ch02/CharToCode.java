package ch02;

class CharToCode {
    public static void main(String[] args) {
        char ch = 'A'; //char ch = 65;
        int code = (int)ch; //형변환

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}
