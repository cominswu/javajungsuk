package ch03;

class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592; //소수점 넷째자리 반올림하는 방법
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0; //0.5는 전 예제와의 차별점
        //(int)(3141.592+0.5)1000.0
        //3142.0/1000.0
        System.out.println(shortPi);
    }
}
