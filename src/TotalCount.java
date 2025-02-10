import java.util.*;

public class TotalCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> hashMap = new HashMap<>();
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
                    hashMap.put(Integer.parseInt(str),hashMap.getOrDefault(Integer.parseInt(str),0)+1);
                    xor=true;
                }
                else {
                    xor=false;
                }
            }
        }

        for(Map.Entry<Integer,Integer> hash : hashMap.entrySet()){
            System.out.println(hash.getKey()+" = "+hash.getValue());
        }

    }
}
