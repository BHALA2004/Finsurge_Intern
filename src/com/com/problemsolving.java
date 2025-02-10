package com.com;

import java.util.*;

public class problemsolving {
     static Scanner scanner = new Scanner(System.in);

     public static void armStrongNumber(){
         int sum = 0;int copyInput = 0;
         System.out.print("Enter total elements:");
         String input ;
         String inputLengthFinding = new String() ;
         int lengthOfString=0;
         boolean flag = false;
         int totalNumber = 0;


         while (flag==false){
             input =scanner.next();
             if(validate(input)){
                 totalNumber = Integer.parseInt(input);
                 if(totalNumber>0){
                     inputLengthFinding=String.valueOf(totalNumber);
                     lengthOfString=inputLengthFinding.length();
                     copyInput=Integer.parseInt(inputLengthFinding);
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

    public static boolean validate(String value){
        int res ;
        try {
            res=Integer.parseInt(value);
            return true;
        }
        catch (Exception e){
            System.out.println("Enter Valid input:");
            return false;
        }
    }

     public static void average(){
         List<Integer> list = new ArrayList<>();
         System.out.print("Enter total elements:");
         String totalValues ;
         boolean flag = false;
         int totalNumber = 0;
         while (flag==false){
             totalValues =scanner.next();
             if(validate(totalValues)){
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
                 if(validate(str)){
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

    public static class WrongInputException extends Exception{
        public WrongInputException(String message) {
            super(message);
        }
    }

    public static long fiboSeries(int n){
        if(n==1 || n==0){
            return n;
        }
        return fiboSeries(n-1)+fiboSeries(n-2);
    }

    public static void finocciSeries(){

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
                System.out.println(e.getMessage()+"\nEnter Valid:");
            }
        }
        for (int i = 0;i<number;i++){
            System.out.println(i+1+" = "+fiboSeries(i));
        }
        int first = 0, second = 1;

//        System.out.print("Fibonacci Series: " + first + " " + second);
//
//        for (int i = 2; i < number; i++) {
//            int next = first + second;
//            System.out.print(" " + next);
//            first = second;
//            second = next;
//        }
    }


    public static void sumOfDigits(){
        String input ;

        System.out.println("Enter Number:");
        boolean flag = false;
        int sum = 0;
        while (flag==false){
            input=scanner.next();
            if(validate(input)){
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

    public static void bigAndSmall(){
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        String totalValues ;
        boolean flag = false;
        int totalNumber = 0;
        while (flag==false){
            totalValues =scanner.next();
            if(validate(totalValues)){
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
                if(validate(str)){
                    list.add(Integer.parseInt(str));
                    xor=true;
                }
                else {
                    xor=false;
                }
            }
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0;i<list.size();i++){
            maxValue= Math.max(maxValue,list.get(i));
        }
        int minValue  = Integer.MAX_VALUE;
        for (int i = 0;i<list.size();i++){
            minValue=Math.min(minValue,list.get(i));
        }
        System.out.println("max = "+maxValue+" "+"min = "+minValue);
    }

    public static int findIndex(Map<Integer,Integer> hashMap,int target){
        return hashMap.containsKey(target)?hashMap.get(target):-1;
    }

    public static void findIndexPosition(){

        Map<Integer,Integer> hashMap = new HashMap<>();

        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        String totalValues ;
        boolean flag = false;
        int totalNumber = 0;
        while (flag==false){
            totalValues =scanner.next();
            if(validate(totalValues)){
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
                if(validate(str)){
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
            if(validate(target)){
                storeTarget=Integer.parseInt(target);
                break;
            }
        }

        System.out.println("Index = "+findIndex(hashMap,storeTarget));
    }

    public static void midElement(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        String totalValues ;
        boolean flag = false;
        int totalNumber = 0;
        while (flag==false){
            totalValues =scanner.next();
            if(validate(totalValues)){
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
                if(validate(str)){
                    list.add(Integer.parseInt(str));
                    xor=true;
                }
                else {
                    xor=false;
                }
            }
        }

        if(list.size()%2==0){
            System.out.println("Middle 1 = "+(list.get(list.size()/2))+" & Middle 2 = "+(list.get(list.size()/2-1)));

        }
        else {
            System.out.println("Middle 1 = "+list.get(list.size()/2));
        }
    }

    public static void replaceNumber(){

        Map<Integer,Integer> hashmap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        String totalValues ;
        boolean flag = false;
        int totalNumber = 0;
        while (flag==false){
            totalValues =scanner.next();
            if(validate(totalValues)){
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
                if(validate(str)){
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

    public static void reverseOrder(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        String totalValues ;
        boolean flag = false;
        int totalNumber = 0;
        while (flag==false){
            totalValues =scanner.next();
            if(validate(totalValues)){
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
                if(validate(str)){
                    list.add(Integer.parseInt(str));
                    xor=true;
                }
                else {
                    xor=false;
                }
            }


        }
        System.out.println("Reverse order ");
        for (int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

    }

    public static int calcSum(int totalNumber){
        int sum = 0;
        while (totalNumber>0){
            sum+=(totalNumber%10);
            totalNumber/=10;
        }
        return sum;
    }

    public static void sumOfDigitsNumber(){
        String input ;

        System.out.println("Enter Number:");
        boolean flag = false;
        int sum = 0;
        while (flag==false){
            input=scanner.next();
            if(validate(input)){
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

    public static int count(List<Integer> list,int target){
        int count = 0;
        for (int i : list){
            if(i==target){
                count++;
            }
        }
        return count;
    }

    public static void targetCount(){
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        String totalValues ;
        boolean flag = false;
        int totalNumber = 0;
        while (flag==false){
            totalValues =scanner.next();
            if(validate(totalValues)){
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
                if(validate(str)){
                    list.add(Integer.parseInt(str));
                    xor=true;
                }
                else {
                    xor=false;
                }
            }


        }

        System.out.println("Enter Target:");
        int target = 0;
        flag=false;
        while (flag==false){
            String value = scanner.next();
            if(validate(value)){
                target=Integer.parseInt(value);
                flag=true;
            }
            else {
                flag=false;
            }
        }
        System.out.println("Target Count  = "+count(list,target));
    }

    public static void totalCountNumber(){
        Map<Integer,Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter total elements:");
        String totalValues ;
        boolean flag = false;
        int totalNumber = 0;
        while (flag==false){
            totalValues =scanner.next();
            if(validate(totalValues)){
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
                if(validate(str)){
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
    public static void main(String[] args) {

        System.out.println("1.ArmStrong\n2.Fibonocci Series\n3.Average\n4.Find Big and Small\5.FindIndex\n6.Find Middle Element\n7.Replace Number\n8.Reverse Order\n9.Sum of Digits\n10.Target Count\n11.Total Count\n12.Exit\n");

        boolean enter = false;
        while (!enter){
            System.out.println("Enter Option:");
            String  option = scanner.next();
            if(validate(option) && Integer.parseInt(option)>0 && Integer.parseInt(option)<13){
               switch (Integer.parseInt(option)){
                   case 1:
                       armStrongNumber();
                       break;
                   case 2:
                       System.out.println("Fibonocci Series");
                       scanner.nextLine();
                       finocciSeries();
                       break;
                   case 3:
                       average();
                       break;
                   case 4:
                       bigAndSmall();
                       break;
                   case 5:
                       findIndexPosition();
                       break;
                   case 6:
                       midElement();
                       break;
                   case 7:
                       replaceNumber();
                       break;
                   case 8:
                       reverseOrder();
                       break;
                   case 9:
                       sumOfDigits();
                       break;
                   case 10:
                       targetCount();
                       break;
                   case 11:
                       totalCountNumber();
                       break;
                   default:
                       enter=true;
                       break;

               }
            }
        }

    }
}
