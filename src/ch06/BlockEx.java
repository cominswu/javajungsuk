package ch06;

class BlockEx {
    static {
        System.out.println("static { }");   //클래스 초기화 블럭
    }
    {
        System.out.println("{ }");   //인스턴스 초기화 블럭
    }
    public BlockEx() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockEx be = new BlockEx(); ");
        BlockEx be = new BlockEx();

        System.out.println("BlockEx be2 = new BlockEx(); ");
        BlockEx be2 = new BlockEx();
    }
}
