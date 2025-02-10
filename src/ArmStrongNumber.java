import java.util.Map;
import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        int sum = 0;int copyInput = 0;
        System.out.print("Enter total elements:");
        String input ;
        String inputLengthFinding ;
        int lengthOfString=0;
        boolean flag = false;
        int totalNumber = 0;


        while (flag==false){
            input =scanner.next();
            if(validation.validate(input)){
                totalNumber = Integer.parseInt(input);
                if(totalNumber>0){
                    inputLengthFinding=String.valueOf(totalNumber);
                    lengthOfString=inputLengthFinding.length();
                    flag=true;
                }
                else {
                    System.out.println("Enter Valid :");
                }

            }
            else {
                flag=false;
            }
        }

        while (totalNumber>0){
            int remainder = totalNumber%10;
            sum+=Math.pow(remainder,lengthOfString);
            totalNumber/=10;
        }

        if(copyInput==sum){
            System.out.println("Its an ArmStrong Number");
        }
        else {
            System.out.println("Its Not an Armstrong Number");
        }
    }
}
