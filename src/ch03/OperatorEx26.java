package ch03;

class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
        System.out.printf("a=%d, b=%d%n", a, b);

        //'||'경우 좌측 피연산자(a!=0)가 참이라서, 그리고 '&&'경우 좌측 피연산자(a==0)가 거짓이라서
        //우측 피연산자까지 평가를 하지않았기때문에 b는 여전히 0이 된다.
    }
}
