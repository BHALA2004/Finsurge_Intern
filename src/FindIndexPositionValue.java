import java.util.*;

public class FindIndexPositionValue {
    public static int findIndex(Map<Integer,Integer> hashMap,int target){
        return hashMap.containsKey(target)?hashMap.get(target):-1;
    }
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
                    hashMap.put(Integer.parseInt(str),i+1);
                    xor=true;
                }
                else {
                    xor=false;
                }
            }
        }
        System.out.print("Enter target:");
        String target;
        int storeTarget;
        while (true){
            target = scanner.next();
            if(validation.validate(target)){
                storeTarget=Integer.parseInt(target);
                break;
            }
        }

        System.out.println("Index = "+findIndex(hashMap,storeTarget));

    }
}



