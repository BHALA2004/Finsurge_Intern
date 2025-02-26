package day14.thread;

import java.util.Map;

class ThreadLifecycleDemo implements Runnable {
    private final Object lock;

    public ThreadLifecycleDemo(Object lock) {
        this.lock = lock;
    }

    @Override
    public synchronized void run() {
        try {
            // RUNNABLE State
            System.out.println(Thread.currentThread().getName() + " is in state: " + Thread.currentThread().getState());

            // BLOCKED State (if another thread holds the lock)
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " has acquired lock.");


                // TIMED_WAITING State
                Thread.sleep(2000);

            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

public class ThreadLifeCycleStates {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadLifecycleDemo threadLifeCycle = new ThreadLifecycleDemo(lock);
        // Creating thread but not starting -> NEW State
        Thread t1 = new Thread(threadLifeCycle, "Thread-1");
        System.out.println(t1.getName() + " is in state: " + t1.getState()); // NEW

        // Starting thread -> Moves to RUNNABLE State
        t1.start();
        Thread.sleep(100); // Give time for execution
        System.out.println(t1.getName() + " is in state: " + t1.getState()); // RUNNABLE

        // Creating another thread to cause BLOCKED state
        Thread t2 = new Thread(threadLifeCycle, "Thread-2");
        t2.start();
        // Allow t2 to try to acquire lock
        System.out.println(t2.getName() + " is in state: " + t2.getState());//Runnable
        Thread.sleep(100);
        System.out.println(t2.getName()+" "+t2.getState());// BLOCKED


        System.out.println(t1.getName() + " is in state: " + t1.getState()); //Runnable

        t1.join();
        t2.join();// Ensuring t1 completes execution
        System.out.println(t1.getName()+" "+t1.getState()); //Terminated
        System.out.println(t2.getName() + "  " + t2.getState()); // TERMINATED
    }
}

