package day14.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Cahce implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
    }
}
public class CachePool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1;i<=5;i++){
            executorService.execute(new Cahce());
        }
        executorService.close();
    }
}
