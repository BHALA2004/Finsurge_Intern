import java.util.Scanner;

public class FibanocciSeries {
    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0;i<number;i++){
            System.out.println(fibo(i));
        }
    }
}
