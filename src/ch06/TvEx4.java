package ch06;
class Tv4{
    //속성
    String color;
    boolean power;
    int channel;

    //기능
    void power() { power = !power; } //온오프 기능
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class TvEx4 {
    public static void main(String[] args) {
        Tv4 [] tvArr = new Tv4[3];

        //Tv객체 생성 + Tv객체 배열의 요소 저장
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv4();
            tvArr[i].channel = i+10; //tvArr[i]의 channel에 i+10 저장
        }

        for (int i = 0; i< tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }
    }
}
