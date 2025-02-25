package day14.thread;


import java.util.Scanner;

class TableRun implements Runnable{
    int number;
    int table;
    public TableRun(int number,int table){
        this.number=number;
        this.table=table;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+"   =   "+number*table);
    }
}
public class TablesByRunnable {
    public static void main(String[] args) {
        System.out.println("Enter which table:");
        Scanner scanner = new Scanner(System.in);
        int table = scanner.nextInt();
       for (int i = 1;i<=20;i++){
           TableRun tableRun = new TableRun(i,table);
           Thread thread = new Thread(tableRun);
           thread.start();
       }

    }
}
