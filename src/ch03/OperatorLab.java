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

import java.util.Scanner;

/*class OperatorLab {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.0f;

        // 1번 문제 true
        System.out.println(a == b);
        //자동형변환규칙에 따라 범위가 더 작은 int타입 변수 a가 범위가 더 큰 float타입으로 변환
        
        // 2번 문제 false
        double d = 0.1;
        float f = 0.1f;
        System.out.println(d == f);
        //자동형변환이 되지만, 애초에 저장된값이 다름, 부동소수점 오차
        //double이 float보다 훨씬 더 정밀하게 0.1에 가까운 값을 표현할 뿐, 둘 다 완벽한 0.1은 아닙니다.
        //비교 시점에는 float인 f가 double로 자동 형변환되지만, 애초에 저장된 근사값이 다르기 때문에
        // == 비교 결과는false가 됩니다.
    }
}*/
class OperatorLab {
    //Quiz: 정수 x가 10보다 크고 20보다 작을 때 true를 반환하는 조건식을 논리 연산자 &&를 사용해서 만들어 보세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x>10 && x<20) {
            System.out.printf("%b", x>10 && x<20);
        } else {
            System.out.printf("%b", x>10 && x<20);
        }
    }
}