package day14.thread;

public class Worker {
    private boolean hasTool = false;

    public void pickUpTool(Worker otherWorker) {
        while (!hasTool) {
            System.out.println(Thread.currentThread().getName() + ": Waiting for the other worker...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }  // Simulating waiting

            if (!otherWorker.hasTool) {
                System.out.println(Thread.currentThread().getName() + ": Let me take it first!");
                hasTool = true;
            }
        }
    }
}

class LivelockSimple {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();

        Thread t1 = new Thread(() -> worker1.pickUpTool(worker2), "Worker-1");
        Thread t2 = new Thread(() -> worker2.pickUpTool(worker1), "Worker-2");

        t1.start();
        t2.start();
    }
}

