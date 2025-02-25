package day14.thread;


class Sync extends Thread{
    public synchronized void run(){
        System.out.println(Thread.currentThread().getName()+" is in Synchronized");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {

        }

    }
}
public class SynchronizationMethods {
    public static void main(String[] args) throws InterruptedException {
        Sync t1 = new Sync();
        Sync t2 = new Sync();
        Sync t3 = new Sync();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t1.start();
        //Thread.sleep(1000);
        t2.start();
        //Thread.sleep(1000);
        t3.start();
    }
}
