import java.util.*;

public class TotalCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> hashmap = new HashMap<>();
        System.out.println("Enter Total Number:");
        int totalValues = scanner.nextInt();
        for (int i = 0;i<totalValues;i++){
            int element = scanner.nextInt();
            hashmap.put(element,hashmap.getOrDefault(element,0)+1);
        }
        for(Map.Entry<Integer,Integer> hash : hashmap.entrySet()){
            System.out.println(hash.getKey()+" = "+hash.getValue());
        }

    }
}
