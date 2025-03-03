package day13;

import java.util.*;

public class StreamsSet {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        System.out.println("Enter Total Number of Elements:");
        int totalNumber = scanner.nextInt();
        for(int i = 0;i<totalNumber;i++){
            int temperary = scanner.nextInt();
            set.add(temperary);
        }

        System.out.println("1.Print\n2.Sort\n3.Distinct\n4.Filter\n5.Limit\n6.Exit\n");

        System.out.println("Printing....");
        set.stream().forEach(i -> System.out.println(i));

        System.out.println("Sorting....");
        set.stream().sorted().forEach(System.out::println);

        System.out.println("Distinct....");
        set.stream().distinct().forEach(System.out::println);

        System.out.println("Filter.....");
        int sum =  set.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(a,b)->a+b);
        System.out.println(sum);

        System.out.println("Limit....");
        set.stream().limit(2).forEach(System.out::println);

        System.out.println("Skipped");
        set.stream().skip(2).forEach(System.out::println);
    }
}
