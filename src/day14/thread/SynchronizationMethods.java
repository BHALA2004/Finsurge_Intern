package day14.thread;
class MyThread implements Runnable {
    @Override
    public synchronized void run() { // Synchronized run method
        System.out.println(Thread.currentThread().getName() + " is running...");
        this.print();
        try {
            Thread.sleep(2000); // Simulating work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
    public synchronized void print(){
        System.out.println(Thread.currentThread().getName()+" in this");
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){

        }
    }
}

public class SynchronizationMethods {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        t2.start();
    }
}
