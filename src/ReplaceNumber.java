import java.util.*;

public class ReplaceNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> hashmap = new HashMap<>();
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
                    hashmap.put(i+1,Integer.parseInt(str));
                    xor=true;
                }
                else {
                    xor=false;
                }
            }
        }


        System.out.println("Before Replace:");
        System.out.println(hashmap);
        System.out.println("Enter Target:");
        int target = scanner.nextInt();
        flag = true;
        for (Map.Entry<Integer,Integer> hash : hashmap.entrySet()){
            if(hash.getValue()==target){
                int key = hash.getKey();
                System.out.println("Enter Number to be Replaced :");
                int replaced = scanner.nextInt();
                hashmap.put(key,replaced);
                flag=false;
            }
        }
        if(flag){
            System.out.println("No target found");
            System.exit(1);
        }
        System.out.println("After Replace");
        System.out.println(hashmap);

    }
}
