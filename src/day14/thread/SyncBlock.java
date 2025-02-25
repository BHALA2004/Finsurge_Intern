package day14.thread;


class Block extends Thread{
    public void print(int n) {
        synchronized (this){
            for (int i = 0;i<n;i++){
                System.out.println(Thread.currentThread().getName()+" Inside");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.err.println(Thread.currentThread().getName()+" outside");
        }

    }
}
public class SyncBlock {
    public static void main(String[] args) {
        Block block = new Block();
        Thread t1 = new Thread(() -> block.print(5));
        Thread t2 = new Thread(()->block.print(10));
        t1.start();;
        t2.start();
    }
}
