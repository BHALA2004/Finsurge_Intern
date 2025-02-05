import java.util.*;

public class FindIndexPositionValue {
    public static int findIndex(Map<Integer,Integer> hashMap,int target){
        return hashMap.containsKey(target)?hashMap.get(target):-1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> hashMap = new HashMap<>();
        System.out.print("Enter total elements:");
        int totalValues = scanner.nextInt();
        for(int i = 0;i<totalValues;i++){
            int input = scanner.nextInt();
            hashMap.put(input,i+1);
        }
        System.out.print("Enter target:");
        int target = scanner.nextInt();
        System.out.println(findIndex(hashMap,target));

    }
}
