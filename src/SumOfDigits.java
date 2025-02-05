import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDigits {
    public static int calcSum(int totalNumber){
        int sum = 0;
        while (totalNumber>0){
            sum+=(totalNumber%10);
            totalNumber/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        String input ;
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        System.out.println("Enter Number:");
        boolean flag = false;
        int sum = 0;
        while (flag==false){
            input=scanner.next();
            if(validation.validate(input)){
                int totalNumber = Integer.parseInt(input);
                if(totalNumber>=0){
                    System.out.println(calcSum(totalNumber));
                }
                else {
                    String convert = String.valueOf(totalNumber).substring(1);
                    int convertingToInt = Integer.parseInt(convert);
                    System.out.println(calcSum(convertingToInt));

                }
                flag=true;
            }
            else {
                flag=false;
            }
        }
    }
}
