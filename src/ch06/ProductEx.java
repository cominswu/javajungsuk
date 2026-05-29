package ch06;

class Product {
    static int count = 0;
    int serialNo;

    //Product 인스턴스가 생성될 때마다 count의 값을 1 증가시켜서 serialNo에 저장
    {
        ++count;
        serialNo = count;
    }
    public Product() {}  //기본 생성자
}

class ProductEx {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serialNo)는 " + p1.serialNo);
        System.out.println("p2의 제품번호(serialNo)는 " + p2.serialNo);
        System.out.println("p3의 제품번호(serialNo)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + Product.count +"개 입니다.");
    }
}
