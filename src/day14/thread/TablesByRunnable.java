package day14.thread;


class TableRun implements Runnable{
    int number;
    public TableRun(int number){
        this.number=number;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" "+number*2);
    }
}
public class TablesByRunnable {
    public static void main(String[] args) {

       for (int i = 1;i<=20;i++){
           TableRun tableRun = new TableRun(i);
           Thread thread = new Thread(tableRun);
           thread.start();
       }

    }
}
