package ch03;

/*class OperatorLab {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;

        // TODO: 아래 코드의 실행 결과를 예측하고,
        // 주석으로 그 이유를 단계별로 설명해주세요.
        j = i++ + ++i; //i++ 시점에서 i는 5, ++i 전에 6이 되고 ++i 하고나서 7이 된다.
                       //j = 5 + 7 = 12

        System.out.println("최종 결과: i = " + i + ", j = " + j);
        //실행결과는 최종 결과: i = 7, j = 12 이다
    }
}*/

class OperatorLab {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.0f;

        // 1번 문제
        System.out.println(a == b);

        // 2번 문제
        double d = 0.1;
        float f = 0.1f;
        System.out.println(d == f);
    }
}
