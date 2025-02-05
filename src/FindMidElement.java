import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMidElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        int totalValues = scanner.nextInt();
        for(int i = 0;i<totalValues;i++){
            list.add(scanner.nextInt());
        }

        if(list.size()%2==0){
            System.out.println((list.get(list.size()/2))+" "+(list.get(list.size()/2-1)));

        }
        else {
            System.out.println(list.get(list.size()/2));
        }
    }
}
