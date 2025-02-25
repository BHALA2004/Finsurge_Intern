package day14.thread;

class TableThread extends Thread{
    private int number;

    public TableThread(int number){
        this.number=number;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" = "+number*2);
    }
}
public class TablesByThread {
    public static void main(String[] args) {
        for (int i = 1;i<=20;i++){
            TableThread tableThread = new TableThread(i);
            tableThread.start();
        }
    }
}
