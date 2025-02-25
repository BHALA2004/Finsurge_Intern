package day14.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Fixed implements Runnable{
    int id;
    public Fixed(int n){
        this.id = n;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1;i<=5;i++){
            executorService.execute(new Fixed(i));
        }
        executorService.close();


    }
}
