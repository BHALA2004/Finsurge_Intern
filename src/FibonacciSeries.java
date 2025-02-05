import java.util.Scanner;

public class FibonacciSeries {
    public static class WrongInputException extends Exception{
        public WrongInputException(String message) {
            super(message);
        }
    }
    public static int fiboSeries(int n){
        if(n==1 || n==0){
            return n;
        }
        return fiboSeries(n-1)+fiboSeries(n-2);
    }
    public static void main(String[] args) throws WrongInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number;
        while (true){
            try{
                number = Integer.parseInt(scanner.nextLine());
                if(number>0){
                    break;
                }
                throw new WrongInputException("Invalid Input,Enter Valid one:");

            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0;i<number;i++){
            System.out.println(i+1+" = "+fiboSeries(i));
        }
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 2; i < number; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }

    }
}
