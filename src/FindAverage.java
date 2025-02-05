import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        String totalValues ;
        boolean flag = false;
        int totalNumber = 0;
        while (flag==false){
            totalValues =scanner.next();
            if(validation.validate(totalValues)){
                totalNumber = Integer.parseInt(totalValues);
                if(totalNumber>0){
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
        for(int i = 0;i<totalNumber;i++){
            boolean xor = false;
            while (xor==false){
                String str = scanner.next();
                if(validation.validate(str)){
                    list.add(Integer.parseInt(str));
                    xor=true;
                }
                else {
                    xor=false;
                }
            }
        }
        int sum=0;
        for(int i : list){
            sum+=i;
        }
        System.out.println("Ans = "+(float) sum/list.size());
    }
}
