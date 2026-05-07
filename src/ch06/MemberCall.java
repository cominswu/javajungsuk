package ch06;

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//  static int cv2 = iv;                  //에러. 클래스 변수는 인스턴스 변수 사용 불가
    static int cv2 = new MemberCall().iv; //객체 생성해야 클래스 변수가 인스턴스 변수 사용 가능

    static void staticMethod1() {
        System.out.println(cv);
//      System.out.println(iv);           //에러. 클래스 메서드에서 인스턴스 변수 사용 불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv);         //객체 생성 후 인스턴스 변수 참조가능
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);           //인스턴스 메서드에서는 인스턴스 변수 사용 가능
    }

    static void staticMethod2() {
        staticMethod1();
//      instanceMethod1();                //에러. 클래스 메서드에서는 인스턴스 메서드 호출 불가
        MemberCall c = new MemberCall();
        c.instanceMethod1();              //인스턴스 생성 후 사용 가능
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();                //인스턴스 메서드에서는 인스턴스 메서드, 클래스 메서드 생성없이 사용 가능
    }

    public static void main(String[] args) {
        // 1. 클래스 메서드 호출
        MemberCall.staticMethod1();

        // 2. 인스턴스 메서드 호출을 위한 객체 생성
        MemberCall mc = new MemberCall();
        mc.instanceMethod1();
    }
}


