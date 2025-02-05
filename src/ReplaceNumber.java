import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReplaceNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> hashmap = new HashMap<>();
        System.out.println("Enter Total Number:");
        int totalValues = scanner.nextInt();
        for (int i = 0;i<totalValues;i++){
            int element = scanner.nextInt();
            hashmap.put(i+1,element);
        }
        System.out.println("Before Replace:");
        System.out.println(hashmap);
        System.out.println("Enter Target:");
        int target = scanner.nextInt();
        boolean flag = true;
        for (Map.Entry<Integer,Integer> hash : hashmap.entrySet()){
            if(hash.getValue()==target){
                int key = hash.getKey();
                System.out.println("Enter Number to be Replaced :");
                int replaced = scanner.nextInt();
                hashmap.put(key,replaced);
                flag=false;
            }
        }
        if(flag){
            System.out.println("No target found");
            System.exit(1);
        }
        System.out.println("After Replace");
        System.out.println(hashmap);

    }
}
