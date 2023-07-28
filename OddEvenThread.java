class Odd implements Runnable{
    public void run(){
        for(int i = 1; i < 100; i+=2){
            System.out.println("Odd Num: " + i);
        }
    }
}
class Even implements Runnable{
    public void run(){
        for(int j = 0; j <= 100; j+=2){
            System.out.println("Even Num: " + j);
        }
    }
}
public class OddEvenThread {
    public static void main(String[] args){
        Odd o = new Odd();
        Even e = new Even();
        Thread thread1 = new Thread(() -> o.run());//or new Thread(new Odd());
        Thread thread2 = new Thread(() -> e.run());//or new Thread(new Even());
        long startTime = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Multi-threaded task completed in " + (endTime - startTime) + " milliseconds");

    }
}
