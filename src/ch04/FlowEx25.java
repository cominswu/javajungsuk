package ch04;

class FlowEx25 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트를 시작합니다.");

        while (i--!=0) {
            System.out.println(i);

            for (long j = 0; j < 5_000_000_000L; j++) { // 카운트다운되는 동안 약간의 시간이 지연되도록함
                ;
            }
        }
        System.out.println("GAME OVER");
    }
}
