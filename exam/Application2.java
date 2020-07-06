package exam;

public class Application2 {
    public static void main(String[] args) {
        new subThread("First").start();
        new subThread("second").start();
        new subThread("Third").start();
    }
}
