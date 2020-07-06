package exam;

public class Application {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("d:" + b.getD());
        System.out.println("f:" + b.getF());
        System.out.println("d方法" +  b.d(b.getD()));
        System.out.println("f方法" + b.f(b.getF()));
    }
}
