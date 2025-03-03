package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequentialAndParallel {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter Total Elements:");
        int n = scanner.nextInt();
        for(int i = 0;i<n;i++){
            int temp = scanner.nextInt();
            list.add(temp);
        }

        list.stream().forEach(i-> System.out.println(Thread.currentThread().getName()+" "+i));
        Thread.sleep(2000);
        list.stream().parallel().forEach(i->System.out.println(Thread.currentThread().getName()+" "+i));

    }
}
