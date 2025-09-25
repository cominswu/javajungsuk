package ch03;

class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

        //char c2 = c1+1; 컴파일 에러
        char c2 = 'a'+1; //형변환 안해도되는 이유 : 리터럴간의 연산이기때문
        //상수 또는 리터럴간의 연산은 실행과정동안 변하는 값이 아님
        //컴파일 시에 컴파일러가 미리 계산해서 그 결과로 대체함으로써 코드를 보다 효율적으로 만들어줌

        System.out.println(c2);
    }
}
