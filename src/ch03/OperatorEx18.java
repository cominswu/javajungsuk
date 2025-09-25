package ch03;

class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000)/1000.0;
        //round메서드 : 매개변수로 받은 값을 소수점 첫째자리에서 반올림하고 그 결과를 정수로 돌려주는 메서드
        // Math.round(3141.592)/1000.0
        //3142/1000.0
        System.out.println(shortPi);
    }
}
