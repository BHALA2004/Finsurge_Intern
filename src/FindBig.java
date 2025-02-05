import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindBig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        int totalValues = scanner.nextInt();
        for(int i = 0;i<totalValues;i++){
            list.add(scanner.nextInt());
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0;i<list.size();i++){
            maxValue= Math.max(maxValue,list.get(i));
        }
        int minValue  = Integer.MAX_VALUE;
        for (int i = 0;i<list.size();i++){
            minValue=Math.min(minValue,list.get(i));
        }
        System.out.println(maxValue+" "+minValue);
    }
}
