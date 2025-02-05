import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        int totalValues = scanner.nextInt();
        for(int i = 0;i<totalValues;i++){
            list.add(scanner.nextInt());
        }
        for (int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

    }
}
