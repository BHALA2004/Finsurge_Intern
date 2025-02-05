import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers:");
        int totalNumber = scanner.nextInt();
        int sum = 0;
        while (totalNumber>0){
            sum+=(totalNumber%10);
            totalNumber/=10;
        }
        System.out.println(sum);
    }
}
