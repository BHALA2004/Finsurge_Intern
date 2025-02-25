package day14.thread;


class SyncStatic extends Thread{
    public synchronized static void print(int n){
        for (int i = 0;i<n;i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SyncClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->SyncStatic.print(5));
        Thread t2 = new Thread(()->SyncStatic.print(10));
        Thread t3 = new Thread(()->SyncStatic.print(7));
        t1.start();t2.start();t3.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);


    }
}
