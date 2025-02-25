package day14.thread;

class SampleTask implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is in state: " + Thread.currentThread().getState());

            // TIMED_WAITING state
            Thread.sleep(2000);

            synchronized (this) {
                // WAITING state
                System.out.println(Thread.currentThread().getName() + " is now in state: " + Thread.currentThread().getState());
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BlockedTask implements Runnable {
    private final Object lock;

    public BlockedTask(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                Thread.sleep(5000); // Hold lock to keep other threads BLOCKED
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        SampleTask task = new SampleTask();
        Thread t1 = new Thread(task, "Thread-1");

        // NEW state
        System.out.println(t1.getName() + " is in state: " + t1.getState());

        t1.start();
        Thread.sleep(100);

        // Timed Waiting
        System.out.println(t1.getName() + " is in state: " + t1.getState());


        Thread.sleep(2500);

        synchronized (task){
            task.notify();
        }

        t1.join();  // Ensure Thread-1 completes

        // TERMINATED state
        System.out.println(t1.getName() + " is in state: " + t1.getState());

        // Demonstrate BLOCKED state
        Object lock = new Object();
        Thread t2 = new Thread(new BlockedTask(lock), "Thread-2");
        Thread t3 = new Thread(new BlockedTask(lock), "Thread-3");

        t2.start();
        Thread.sleep(100);  // Ensure t2 gets the lock first
        t3.start();
        Thread.sleep(100);  // Ensure t3 enters BLOCKED state

        System.out.println(t2.getName()+" is in state: "+t2.getState());
        System.out.println(t3.getName() + " is in state: " + t3.getState()); // BLOCKED

        t2.join();
        t3.join();

        System.out.println("Both threads have completed execution.");
    }
}

