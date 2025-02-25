package day14.thread;

public class SyncExample2 {
    public synchronized void print(int n) throws InterruptedException {
        for (int i = 0;i<n;i++){
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}
class Value1 extends Thread{

    SyncExample2 syncExample2;
    public Value1(SyncExample2 syncExample2){
        this.syncExample2=syncExample2;
    }

    @Override
    public void run(){
        try {
            syncExample2.print(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Value2 extends Thread{

    SyncExample2 syncExample2;
    public Value2(SyncExample2 syncExample2){
        this.syncExample2=syncExample2;
    }

    @Override
    public void run(){
        try {
            syncExample2.print(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MainSync {
    public static void main(String[] args) {
        SyncExample2 syncExample2 = new SyncExample2();
        Thread t1 = new Value1(syncExample2);
        t1.start();
        Thread t2 = new Value2(syncExample2);
        t2.start();
    }
}
