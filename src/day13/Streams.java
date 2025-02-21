package day13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,4,3,6,8);
       int sum =  list.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(a,b)->a+b);
        System.out.println(sum);

        List<Integer> l = list.stream().sorted().collect(Collectors.toList());
        System.out.println(l);

        list.stream().forEach(n-> System.out.print((char) (n+('a'-1))+" "));
    }
}
