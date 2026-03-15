package ch06;
class Tv{
    //속성
    String color;
    boolean power;
    int channel;

    //기능
    void power() { power = !power; } //온오프 기능
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class TvEx {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel =7;
        t.channelDown();
        System.out.println("현재 채널은 "+t.channel+"입니다.");
    }
}
