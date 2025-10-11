package ch04;

class FlowEx23 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        for (int tmp : arr) { // for (타입변수명 : 배열 또는 컬렉션 ) { 반복할문장 }
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}
