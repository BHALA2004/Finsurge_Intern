import java.util.Map;
import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = scanner.nextInt();
        int copyInput = input;
        String inputLengthFinding = String.valueOf(input);
        int lengthOfString = inputLengthFinding.length();
        int sum = 0;
        while (input>0){
            int remainder = input%10;
            sum+= Math.pow(remainder,lengthOfString);
            input/=10;
        }
        if(copyInput==sum){
            System.out.println("Its an ArmStrong Number");
        }
        else {
            System.out.println("Its Not an Armstrong Number");
        }
    }
}
