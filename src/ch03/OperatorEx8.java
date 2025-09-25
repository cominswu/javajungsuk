package ch03;

class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a*b; //int타입끼리의 연산결과는 int타입임
        //이미 a*b의 결과는 int타입으로 됐기때문에 long형으로 자동형변환되어도 값은 변하지않는다
        //a나 b를 long으로 형변환해야 올바른 결과가 나온다
        System.out.println(c);
    }
}
