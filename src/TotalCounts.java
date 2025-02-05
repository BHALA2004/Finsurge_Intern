import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TotalCounts {
    public static int count(List<Integer> list,int target){
        int count = 0;
        for (int i : list){
            if(i==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 5;
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        int totalValues = scanner.nextInt();
        for(int i = 0;i<totalValues;i++){
            list.add(scanner.nextInt());
        }
        System.out.println(count(list,target));
    }
}
