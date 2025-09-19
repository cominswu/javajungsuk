package ch02;

class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\''); // '''처럼 할수없음
        System.out.println("abc\t123\b456"); // \b에 의해 3이 지워짐
        System.out.println('\n'); // 개행 문자 출력 후 개행
        System.out.println("\"Hello\""); // 큰따옴표 출력하려면 이렇게
        System.out.println("c:\\");
    }
}
