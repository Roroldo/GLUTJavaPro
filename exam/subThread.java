package exam;

public class subThread extends Thread {

    public subThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("线程名称" + threadName);
        try {
            Thread.sleep((long)(Math.random()*1000));
            System.out.println("finished" + threadName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
