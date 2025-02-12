package com.implementation;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDetailsMain {
    static int userId = 1;
    public static void print(List<UserDetails> userDetailsList){
        if(userDetailsList.size()==0){
            System.out.println("No Details Found");
        }
        else {
            for (UserDetails userDetails : userDetailsList) {
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("User ID = " + userDetails.userId + "\n" + "User Name = " + userDetails.userName + "\n" + "User Age = " + userDetails.userAge + "\n" + "User Address = " + userDetails.userAddress + "\n" + "User Phone Number = " + userDetails.userPhoneNumber + "\n" + "User Department = " + userDetails.userDepartment);
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }
    public static boolean validate (String value){
        int res;
        try {
            res = Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            System.out.println("Enter Valid input:");
            return false;
        }
    }
    public static boolean validateLong (String value){
        long res;
        try {
            res = Long.parseLong(value);
            return true;
        } catch (Exception e) {
            System.out.println("Enter Valid input:");
            return false;
        }
    }
    public static boolean validateFloat (String value){
        float res;
        try {
            res = Float.parseFloat(value);
            return true;
        } catch (Exception e) {
            System.out.println("Enter Valid input:");
            return false;
        }
    }
    public static boolean checkDepartment(List<Department> list,String department){
        for(Department d : list){
            if(d.departmentName.equals(department)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new Department(1,"CSE"));
        departmentList.add(new Department(2,"ECE"));
        departmentList.add(new Department(3,"MECH"));
        departmentList.add(new Department(4,"EEE"));
        departmentList.add(new Department(5,"CIVIl"));
        Validation validation = new Validation();
        System.out.println("1.Leap Year\n2.Find Standard Deviation\n3.Print User Details\n4.Switch case Implementation\n5.Increment Function\n6.Decrement Function\n7.Exit\n");
        List<UserDetails> userDetailsList = new ArrayList<>();
        boolean flag = true;
        int option = 0;
        while (flag){
            System.out.println("Enter Option:");
            boolean optionFlag = true;
            while (optionFlag){
                String optionValue = scanner.next();
                if(validation.validate(optionValue)){
                    option=Integer.parseInt(optionValue);
                    if(option>0 && option <8){
                        optionFlag=false;
                    }
                    else {
                        System.out.println("Enter Valid");
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
                        if(validate(year)){
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
                            if(validateFloat(str)){
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
                case 3 :
                    System.out.println("1. Add User\n2. Print User Details\n3. Exit");
                    flag = true;
                    boolean whole = true;

                    while (whole) {
                        while (flag) {
                            System.out.println("Enter User option:");
                            String optionValue = scanner.next();
                            if (validation.validate(optionValue)) {
                                option = Integer.parseInt(optionValue);
                                if (option > 0 && option < 4) {
                                    flag = false;
                                }
                            }
                        }

                        scanner.nextLine(); // Consume newline

                        if (option == 1) {
                            String userName;
                            while (true) {
                                System.out.print("Enter User Name: ");
                                userName = scanner.nextLine(); // Read full name
                                if (userName.matches("^[A-Z][a-z]+( [A-Z][a-z]*)*$")) {
                                    break;
                                } else {
                                    System.out.println("Invalid Input");
                                }
                            }

                            int age = 0;
                            while (true) {
                                System.out.print("Enter Age: ");
                                String getOption = scanner.nextLine();
                                if (validation.validate(getOption)) {
                                    age = Integer.parseInt(getOption);
                                    if (age >= 0) {
                                        break;
                                    }
                                    else {
                                        System.out.println("Enter Valid Age:");
                                    }
                                }
                            }

                            String userAddress;
                            while (true) {
                                System.out.print("Enter Address: ");
                                userAddress = scanner.nextLine();
                                if (userAddress.matches("[0-9A-Za-z /]+")) {
                                    break;
                                }
                                else {
                                    System.out.println("Enter Valid Address:");
                                }
                            }

                            long userPhoneNumber = 0;
                            while (true) {
                                System.out.print("Enter Phone Number: ");
                                String userPhone = scanner.nextLine();
                                if (validateLong(userPhone) && userPhone.length() == 10) {
                                    userPhoneNumber = Long.parseLong(userPhone);
                                    break;
                                }
                                else {
                                    System.out.println("Enter Valid phone number:");
                                }
                            }

                            String department;
                            while (true) {
                                System.out.print("Enter Department: ");
                                department = scanner.next();
                                if (checkDepartment(departmentList, department)) {
                                    break;
                                }
                                else {
                                    System.out.println("Enter Valid Department");
                                }
                            }

                            userDetailsList.add(new UserDetails(userId, userName, age, userAddress, userPhoneNumber, department));
                            userId++;
                            flag=true;

                        } else if (option == 2) {
                            print(userDetailsList);
                            flag=true;
                        } else if (option == 3) {
                            flag=true;
                            whole = false;
                        }
                    }
                    break;
                case 4:
                    String day ;
                    while (true){
                        System.out.println("Enter Day from 0 to 6:");
                        day = scanner.next();
                        if(validate(day) && Integer.parseInt(day)>=0 && Integer.parseInt(day)<=6){
                            break;
                        }
                        else {
                            System.out.println("Enter Valid");
                        }
                    }
                    System.out.println(Demo2.switchCaseImplementation(Integer.parseInt(day)));
                    break;
                case 5:
                    int inc = Demo2.addValue();
                    System.out.println("Current Increment Value = "+inc);
                    break;
                case 6:
                    int dec = Demo2.subValue();
                    System.out.println("Current Decrement Value = "+dec);
                    break;
                case 7:
                    flag=false;
                    break;
                default:
                    System.out.println("Enter Valid Option:");
                    break;
            }
        }
    }
}
class Department{
    int departmentId;
    String departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }
}
