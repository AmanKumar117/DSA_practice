public class MultiThreadExample {
    public static void main(String[] args) {
        Demo threadDemo1 = new Demo("Example1");
        threadDemo1.start();
        Demo threadDemo2 = new Demo("Example2");
        threadDemo2.start();
    }
}
class Demo implements Runnable {
    Thread thread;
    private String demoName;
    Demo(String name) {
        demoName = name;
    }
    @Override
    public void run() {
        System.out.println("Thread running" + demoName);
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            System.out.println(demoName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
        }
    }
    public void start() {
        System.out.println("Thread started");
        if (thread == null) {
        thread = new Thread(this, demoName);
        thread.start();
        }
    }
}
