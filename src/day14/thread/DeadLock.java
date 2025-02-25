package day14.thread;
class DeadLock {
    static final Object resource1 = new Object();
    static final Object resource2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 locked resource 1");
                try {
                    Thread.sleep(2);
                } catch (Exception e) {

                }
                synchronized (resource2) {
                    System.out.println("Thread 1 locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 locked resource 2");
                try {
                    Thread.sleep(2);
                } catch (Exception e) {

                }
                synchronized (resource1) {
                    System.out.println("Thread 2 locked resource 1");
                }
            }
        });
//DEADLOCK
        t1.start();
        //PREVENT DEADLOCK
        t1.join();
        t2.start();
    }
}
