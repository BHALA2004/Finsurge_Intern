package day14.thread;

class ThreadLifecycleDemo implements Runnable {
    private final Object lock;

    public ThreadLifecycleDemo(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            // RUNNABLE State
            System.out.println(Thread.currentThread().getName() + " is in state: " + Thread.currentThread().getState());

            // BLOCKED State (if another thread holds the lock)
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " has acquired lock.");

                // WAITING State
                lock.wait();

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

        // Creating thread but not starting -> NEW State
        Thread t1 = new Thread(new ThreadLifecycleDemo(lock), "Thread-1");
        System.out.println(t1.getName() + " is in state: " + t1.getState()); // NEW

        // Starting thread -> Moves to RUNNABLE State
        t1.start();
        Thread.sleep(100); // Give time for execution
        System.out.println(t1.getName() + " is in state: " + t1.getState()); // RUNNABLE

        // Creating another thread to cause BLOCKED state
        Thread t2 = new Thread(new ThreadLifecycleDemo(lock), "Thread-2");
        t2.start();
        // Allow t2 to try to acquire lock
        System.out.println(t2.getName() + " is in state: " + t2.getState()); // BLOCKED

        // Notify t1 to move from WAITING -> TIMED_WAITING
        synchronized (lock) {
            lock.notifyAll();
        }

        Thread.sleep(3000); // Wait for TIMED_WAITING to finish
        System.out.println(t1.getName() + " is in state: " + t1.getState()); // TERMINATED

        t1.join(); // Ensuring t1 completes execution
         // Ensuring t2 completes execution

        System.out.println(t2.getName() + " is in state: " + t2.getState()); // TERMINATED
    }
}

