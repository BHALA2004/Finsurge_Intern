import java.util.Scanner;

public class Validation {
    Scanner scanner = new Scanner(System.in);
    public boolean validate(String value){
        int res ;
        try {
            res=Integer.parseInt(value);
            return true;
        }
        catch (Exception e){
            System.out.println("Enter Valid input");
            return false;
        }
    }
}
