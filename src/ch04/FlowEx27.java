package ch04;

class FlowEx27 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        // i 를 1씩 증가시켜서 sum에 계쏙 더해나간다
        while ((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
