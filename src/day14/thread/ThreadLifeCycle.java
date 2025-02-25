package day14.thread;

class thread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getState());
        try {
            Thread.sleep(8000);
        }
        catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("Terminate");
    }
}
public class ThreadLifeCycle {
    public static void main(String[] args){
        thread thread = new thread();
        System.out.println(thread.getState());
        thread.start();
        try
        {
            thread.sleep(4000);
        }
        catch (Exception e){

        }

        System.out.println(thread.getState());
        try {
            thread.join();
        }
        catch (Exception e){
            System.out.println("Error");
        }

        System.out.println("Completed");

    }
}
