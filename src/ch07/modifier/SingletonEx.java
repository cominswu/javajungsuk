package ch07.modifier;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        //...
    }
    public static Singleton getInstance() {
        if(s==null)
            s = new Singleton();

        return s;
    }
}

class SingletoneEx {
    public static void main(String[] args) {
        //Singleton s = new Singleton();  에러발생
        Singleton s = Singleton.getInstance();
    }
}