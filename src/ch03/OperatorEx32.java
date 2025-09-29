package ch03;

class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        //조건식 ? 식1(참) : 식2(거짓)
        //변수 = 조건식 ? 식1 : 식2
        //조건식이 true면 변수에는 식1의 값이 저장, false면 식2의 값이 저장됨

        absX = x >= 0 ? x : -x; //x값이 음수면, 양수로 만든다.
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        signX = x > 0 ? '+' : (x == 0 ? ' ' : '-');//조건연산자를  중첩
        signY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("x = %c%d%n", signX, absX);
        System.out.printf("y = %c%d%n", signY, absY);
        System.out.printf("z = %c%d%n", signZ, absZ);
    }
}
