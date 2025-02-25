package day14.thread;
class MyThreads extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is RUNNING.");
            Thread.sleep(5000); // Moves to TIMED_WAITING state
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " got INTERRUPTED.");
        }
        System.out.println(Thread.currentThread().getName() + " is TERMINATED.");
    }
}

public class Interruption {
    public static void main(String[] args) {
        MyThreads thread = new MyThreads();
        thread.start();

        try {
            Thread.sleep(2000); // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt(); // Interrupt the sleeping thread
        System.out.println("Main thread requested interruption.");
    }
}
