package day11.educationalloan;
import java.util.*;

import day11.educationalloan.Validation;
public class CalculationImplementation extends Calculation{
    Scanner scanner = new Scanner(System.in);
    public List<BankDetails> bankDetailsArrayList;
    public String[] couseArray = {"BE","ARTS","MEDICAL"};
    public List<String> courseList = Arrays.asList(couseArray);

    public static Map<String, Integer> getMapData() {
        Map<String, Integer> map = new HashMap<>();
        map.put("BE",5);
        map.put("ARTS",4);
        map.put("MEDICAL",8);
        return map;
    }

    Map<String,Integer> hashMapDuration = getMapData();
    public void setBankDetailsArrayList(List<BankDetails> bankDetailsArrayList) {
        this.bankDetailsArrayList = bankDetailsArrayList;
    }

    @Override
    public BankDetails getBankDetails(){
            System.out.println("Bank Name:");
            String bankName;
            while (true){
                bankName = scanner.nextLine();
                if(Validation.validateBankName(bankName)){
                    break;
                }
                else {
                    System.out.println("Invalid,Enter Valid:");
                }
            }

            System.out.printf("Enter %s Interest:",bankName);
            int interest;
            while (true){
                try {
                    interest=scanner.nextInt();
                    if(interest>0 && interest<=99){
                        break;
                    }
                    else {
                        System.out.println("Percent should less than 100 and Greater Than 0");
                    }
                }
                catch (Exception e){
                    System.out.println("Invalid,Enter Valid:");
                }
            }
            scanner.nextLine();
            return new BankDetails(bankName,interest);
    }

    @Override
    public StudentDetails getStudentDetails(){
        System.out.println("Enter Student Name:");
        String studentName;
        while (true){
            studentName = scanner.nextLine();
            if(Validation.validatePersonName(studentName)){
                break;
            }
            else {
                System.out.println("Invalid,Enter Valid:");
            }
        }

        System.out.println("Enter Student Course Name:");
        String studentCourseName;
        while (true){
            studentCourseName = scanner.next();
            if(Validation.findCourse(courseList,studentCourseName)){
                break;
            }
            else {
                System.out.println("Invalid Course Name");
            }
        }

        System.out.println("Enter Loan Amount:");
        long loanAmount;
        while (true){
            try {
                loanAmount = scanner.nextLong();
                if(loanAmount>=50000 && loanAmount<=1500000){
                    break;
                }
                else {
                    System.out.println("Loan Too high or Too Low");
                }
            }
            catch (Exception e){
                System.out.println("Invalid,Enter Valid");
            }
        }
        System.out.printf("%-10s %s%n","Bank Name","Intrest%");
        for (int i = 0; i < bankDetailsArrayList.size(); i++) {
            System.out.printf("%-10s %s%n", (i + 1) + ".", bankDetailsArrayList.get(i).getBankName() + " - " + bankDetailsArrayList.get(i).getAnnualPercentIncome()+"%");
        }
        scanner.nextLine();
        System.out.println("Enter which Bank do you want to get Loan:");
        String bankName;
        int bankId;
        int bankPercent;
        while (true){
            bankName = scanner.nextLine();
            if(Validation.validateBankName(bankName) && Validation.findBank(bankDetailsArrayList,bankName)){
                BankDetails bankObject= Validation.findBankObject(bankDetailsArrayList,bankName);
                bankId=bankObject.getBankId();
                bankPercent=bankObject.getAnnualPercentIncome();
                break;
            }
            else {
                System.out.println("Invalid,Enter Valid:");
            }
        }


        System.out.println("Enter years to calculate Interest:");
        int years ;
        while (true){
            try {
                years = scanner.nextInt();
                if(years>=1 && years<=20){
                    break;
                }
                else {
                    System.out.println("Loan Not Possible");
                }
            }
            catch (Exception e){
                System.out.println("Invalid,Enter Valid:");
            }
        }

        float intrestPerYear = 0;
        int value = 0;
        if(years==hashMapDuration.get(studentCourseName) || years<hashMapDuration.get(studentCourseName)){
            intrestPerYear=0;
        }
        else if (years>hashMapDuration.get(studentCourseName)) {
            value = ((years)-(hashMapDuration.get(studentCourseName)+1))+1;
            intrestPerYear=(loanAmount*value*bankPercent)/100;
        }
        float intrestPerMonth = (intrestPerYear)/12;
        float finalAmount = (intrestPerYear*value)+loanAmount;
        return new StudentDetails(studentName,studentCourseName,loanAmount,bankPercent,years,intrestPerMonth,intrestPerYear,finalAmount,bankId);
    }

    @Override
    public void print(StudentDetails studentDetails){
        System.out.println("------------------------------");
        System.out.printf("%-20s: %d\n", "Student ID", studentDetails.getStudentId());
        System.out.printf("%-20s: %s\n", "Student Name", studentDetails.getStudentName());
        System.out.printf("%-20s: %s\n", "Course Name", studentDetails.getStudentCourseName());
        System.out.printf("%-20s: %c%d\n", "Loan Amount", '₹', studentDetails.getLoanAmount());
        System.out.printf("%-20s: %.2f%c\n", "Interest Percent", studentDetails.getInterestPercent(), '%');
        System.out.printf("%-20s: %d%s\n", "Loan Duration", studentDetails.getLoanYears(), " yrs");
        System.out.printf("%-20s: %c%.2f\n", "Interest Per Month", '₹', studentDetails.getInterestPerMonth());
        System.out.printf("%-20s: %c%.2f\n", "Interest Per Year", '₹', studentDetails.getInterestPerYear());
        System.out.printf("%-20s: %c%.2f\n", "Final Amount", '₹', studentDetails.getFinalAmount());
        System.out.printf("%-20s: %d\n", "Bank ID", studentDetails.getBankId());
        System.out.println("Thank You!");
        System.out.println("------------------------------------");
    }
}
