//class ThreadDemo implements Runnable
class ThreadDemo implements Runnable {
    public void run(){
        System.out.println("I am a thread demo and I am running");
    }
}
public class Threads {
    public static void main(String[] args){
        ThreadDemo t1 = new ThreadDemo();
        t1.run();
    }
}