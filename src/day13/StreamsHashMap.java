package day13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StreamsHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Bala");
        hashMap.put(2,"Viruthaachalam");
        hashMap.put(3,"Tirutani");
        hashMap.put(4,"Vaali");
        hashMap.put(5,"Kaasi");
        hashMap.put(6,"Vaali");

        System.out.println("1.Print\n2.Sort\n3.Distinct\n4.Filter\n5.Limit\n6.Exit\n");

        System.out.println("Printing....");
        hashMap.entrySet().stream().forEach(System.out::println);

        System.out.println("Sorting....");
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));

        System.out.println("Distinct....");
        hashMap.values().stream().distinct().forEach(System.out::println);

        System.out.println("Filter....");
        hashMap.keySet().stream().filter(k -> k%2 == 0).forEach(entry -> System.out.println(hashMap.get(entry)));

        System.out.println("Limit....");
        hashMap.values().stream().limit(2).forEach(k -> System.out.println(k));





    }
}
