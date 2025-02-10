import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CopyArrayImplementation {

    public static void desendingOrder(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void ascendingOrder(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static int[] copyArray(int[] array){
        int[] copyArray = array;
        return copyArray;
    }
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
        int[] array = new int[totalNumber];

        for(int i = 0;i<totalNumber;i++){
            boolean xor = false;
            while (xor==false){
                String str = scanner.next();
                if(validation.validate(str)){
                    array[i]=Integer.parseInt(str);
                    xor=true;
                }
                else {
                    xor=false;
                }
            }
        }
        System.out.println("Input Array = "+Arrays.toString(array));
        int[] copyArray = copyArray(array);
        System.out.println("Copied Array = "+Arrays.toString(copyArray));
        System.out.println("AscendingOrder");
        ascendingOrder(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Desending Order");
        desendingOrder(copyArray);
        System.out.println(Arrays.toString(copyArray));



    }
}
