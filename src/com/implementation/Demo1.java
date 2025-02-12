package com.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Demo1 {

        public static float mean(List<Float> meanList){
            float result = 0;
            for (float i : meanList){
                result+=i;
            }
            return result/meanList.size();
        }
        public static boolean isLeapYear(int year){
            if(year%4==0 && year%100!=0 || year%400==0){
                return true;
            }
            return false;
        }

        public static List<Float> deviance(List<Float> list,float meanValue){
            List<Float> meanList = new ArrayList<>();
            for (float i : list){
                float value = (float) Math.pow(Math.abs(i-meanValue),2);
                meanList.add(value);
            }
            return meanList;
        }

        public static float variance(List<Float> variable){
            float result = 0;
            for (float i : variable){
                result+=i;
            }
            return result/variable.size();
        }
        public static float stddev(List<Float> list){
            float meanValue = mean(list);
            List<Float> findDeviance = deviance(list,meanValue);
            float variance = variance(findDeviance);
            return (float) Math.sqrt(variance);
        }

        public static void print(List<UserDetails> userDetails){
            for (UserDetails userDetails1 : userDetails){
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("User ID : "+userDetails1.userId);
                System.out.println("User Name : "+userDetails1.userName);
                System.out.println("User Age:"+userDetails1.userAge);
                System.out.println(userDetails1.userAddress);
                System.out.println(userDetails1.userPhoneNumber);
                System.out.println(userDetails1.userDepartment);
                System.out.println("---------------------------------------------------------------------------");
            }
        }
}
