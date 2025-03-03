package day13;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAllMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter Total Elements:");
        int n = scanner.nextInt();
        for(int i = 0;i<n;i++){
            int temp = scanner.nextInt();
            list.add(temp);
        }
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("Alice", "HR");
        hashMap.put("Bob", "IT");
        hashMap.put("Charlie", "HR");
        hashMap.put("David", "IT");
        hashMap.put("Eve", "Finance");
        hashMap.put("Suhail","Manager");


        Map<String,List<String>> hashing = hashMap.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
        System.out.println(hashing);

        Map<Boolean,List<Integer>> newList = list.stream().collect(Collectors.partitioningBy(i->i>2));
        System.out.println(newList);

        boolean value1 = list.stream().allMatch(i->i%2==0);
        System.out.println(value1);

        boolean value2 = hashMap.entrySet().stream().anyMatch(entry->entry.getValue().equals("HR"));
        System.out.println(value2);



        boolean value3 = list.stream().noneMatch(i->i==0);
        System.out.println(value3);

        System.out.println(list.stream().findFirst().get());

        System.out.println(list.stream().findAny().get());

        System.out.println();

        List<Integer> list1 = list.stream().peek(i-> i = i+2).collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> list2 = list.stream().peek(i-> System.out.println("Before = "+i)).map(i->i*2).peek(i-> System.out.println("After = "+i)).collect(Collectors.toList());
        System.out.println(list2);


        List<List<Integer>> list3 = new ArrayList<>();
        list3.add(new ArrayList<>(Arrays.asList(2,1,4,5)));
        list3.add(new ArrayList<>(Arrays.asList(3,2,14,40)));

        Stream<Integer> stream = list3.stream().flatMap(List::stream);
        System.out.println(stream.toList());


    }


}
