package day14.thread;

import java.util.concurrent.*;

public class CallableAndFuture implements Callable<Integer> {
    @Override
    public Integer call() throws InterruptedException {

        return 50;
    }
}
class CallableMain{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new CallableAndFuture());

        while (!future.isDone()){
            System.out.println("Process is Waiting");
        }
        System.out.println(future.get());
        executorService.close();
    }
}
