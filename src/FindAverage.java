import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        int totalValues = scanner.nextInt();
        for(int i = 0;i<totalValues;i++){
            list.add(scanner.nextInt());
        }
        int sum=0;
        for(int i : list){
            sum+=i;
        }
        System.out.println((float) sum/list.size());
    }
}
