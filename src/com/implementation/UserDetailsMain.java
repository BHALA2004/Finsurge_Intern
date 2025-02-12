package com.implementation;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDetailsMain {
    public static boolean validate (String value){
        float res;
        try {
            res = Float.parseFloat(value);
            return true;
        } catch (Exception e) {
            System.out.println("Enter Valid input:");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        System.out.println("1.Leap Year\n2.Find Standard Deviation\n3.Print User Details\n");
        boolean flag = true;
        int option = 0;
        while (flag){
            System.out.println("Enter Option:");
            boolean optionFlag = true;
            while (optionFlag){
                String optionValue = scanner.next();
                if(validation.validate(optionValue)){
                    option=Integer.parseInt(optionValue);
                    if(option>0 && option <4){
                        optionFlag=false;
                    }
                }
            }
            switch (option){
                case 1:
                    System.out.println("Enter Year:");
                    int yearValue = 0;
                    String year ;
                    optionFlag=true;
                    while (optionFlag){
                        year=scanner.next();
                        if(validation.validate(year)){
                            yearValue=Integer.parseInt(year);
                            if(yearValue>0){
                                optionFlag=false;
                            }
                        }
                    }
                    if(Demo1.isLeapYear(yearValue)){
                        System.out.println("Leap Year");
                    }
                    else {
                        System.out.println("Not leap year");
                    }
                    break;
                case 2:
                    List<Float> list = new ArrayList<>();
                    System.out.print("Enter total elements:");
                    String totalValues ;
                    flag = false;
                    float totalNumber = 0;
                    while (flag==false){
                        totalValues =scanner.next();
                        if(validate(totalValues)){
                            totalNumber = Float.parseFloat(totalValues);
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
                                list.add(Float.parseFloat(str));
                                xor=true;
                            }
                            else {
                                xor=false;
                            }
                        }
                    }
                    float result = Demo1.mean(list);
                    System.out.println("Standard Deviation : "+result);
                    break;
                default:
                    break;
            }
        }
    }
}
