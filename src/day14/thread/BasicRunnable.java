package day14.thread;

public class BasicRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class Main{
    public static void main(String[] args) {
        BasicRunnable basicRunnable = new BasicRunnable();
        Thread thread = new Thread(basicRunnable);
        Thread thread1 = new Thread(basicRunnable);
        thread.start();
        thread1.start();
    }
}
