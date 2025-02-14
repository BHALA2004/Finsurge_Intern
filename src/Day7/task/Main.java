package Day7.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner scanner = new Scanner(System.in);
        College college = new College();
        System.out.println("1.Shallow Copy\n2.Deep Copy\n3.Exit");
        while (true){
            System.out.println("Enter option :");
            int optionValue;
            String option;
            while (true){
                option = scanner.next();
                if(option.matches("\\d{1}") && Integer.parseInt(option)>0 && Integer.parseInt(option)<4){
                    optionValue = Integer.parseInt(option);
                    break;
                }
                else {
                    System.out.println("Invalid,Enter Valid:");
                }
            }
            if (optionValue==1){

                College college1 = college.getCollegeDetails();
                College college2 = college1;
                College.printCollegeandStudentDetails(college1);
                college2.collegeName="NEC";
                College.printCollegeandStudentDetails(college1);
                College.printCollegeandStudentDetails(college2);


            } else if (optionValue==2) {
                College newCollege = college.getCollegeDetails();
                College newCollege1 = (College) newCollege.clone();
                College.printCollegeandStudentDetails(newCollege);
                newCollege1.collegeName="NEC";
                College.printCollegeandStudentDetails(newCollege);
                College.printCollegeandStudentDetails(newCollege1);

            }
            else if(optionValue==3){
                break;
            } else if (optionValue>=4) {
                System.out.println("Invalid,Enter Valid");
            }
        }
    }

}
