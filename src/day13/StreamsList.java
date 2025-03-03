package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamsList {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter Total Number of Elements:");
        int totalNumber = scanner.nextInt();
        for(int i = 0;i<totalNumber;i++){
            int temperary = scanner.nextInt();
            list.add(temperary);
        }

        System.out.println("1.Print\n2.Sort\n3.Distinct\n4.Filter\n5.Limit\n6.Exit\n");

        System.out.println("Printing....");
        list.stream().forEach(i -> System.out.println(i));

        System.out.println("Sorting....");
        list.stream().sorted().forEach(System.out::println);

        System.out.println("Distinct....");
        list.stream().distinct().forEach(System.out::println);

        System.out.println("Filter.....");
       int sum =  list.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(a,b)->a+b);
        System.out.println(sum);

        System.out.println("Limit....");
        list.stream().limit(2).forEach(System.out::println);
    }
}
