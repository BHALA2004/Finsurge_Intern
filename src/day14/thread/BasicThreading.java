package day14.thread;


import Day7.task.Main;

class Threading extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class BasicThreading {
    public static void main(String[] args) {

        Thread t = new Thread(new Threading());
        Thread t1 = new Thread(new Threading());
        Thread t2 = new Thread(new Threading());
        Thread t3 = new Thread(new Threading());
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
