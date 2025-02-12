package com.implementation;

public class Demo2 {
    static int increment = 0;
    static int decrement  = 100;
        public static String switchCaseImplementation(int day){
            switch (day){
                case 0:
                    return "Sunday";
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                default:
                    return "Invalid";
            }
        }

        public static int addValue(){
            System.out.println("Previous static Increment Value = "+increment);
            increment++;
            return increment;
        }

    public static int subValue(){
        System.out.println("Previous static Decrement Value = "+decrement);
        decrement--;
        return decrement;
    }

    public static int changeValue(){
            final int modify = 2;
        System.out.println(modify);
        try {
            //modify=10;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return modify;
    }

}
