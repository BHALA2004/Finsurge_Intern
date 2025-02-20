package day11.educationalloan;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean validateBankName(String bankName){
        Pattern pattern = Pattern.compile("^([A-Z][a-z]+)+( [A-Z][a-z]+)*");
        Matcher matcher = pattern.matcher(bankName);
        return matcher.matches();
    }

    public static boolean validatePersonName(String employeeName){
        Pattern pattern = Pattern.compile("^([A-Z][a-z]*)+( [A-Z][a-z]*)*$");
        Matcher matcher = pattern.matcher(employeeName);
        return matcher.matches();
    }

    public static boolean validateCourseName(String courseName){
        Pattern pattern = Pattern.compile("([A-Z]{2})|([A-Z]{4}|([A-Z]{7}))");
        Matcher matcher = pattern.matcher(courseName);
        return matcher.matches();
    }

    public static boolean findBank(List<BankDetails> bankDetailsList , String bankname){
        for (BankDetails bankDetails : bankDetailsList){
            if(bankDetails.getBankName().equalsIgnoreCase(bankname)){
                return true;
            }
        }
        return false;
    }

    public static boolean findCourse(List<String> courseList,String couseName){
        for (String s : courseList){
            if(s.equalsIgnoreCase(couseName)){
                return true;
            }
        }
        return false;
    }

    public static BankDetails findBankObject(List<BankDetails> bankDetailsList, String bankName){
        for (BankDetails bankDetails : bankDetailsList){
            if(bankDetails.getBankName().equalsIgnoreCase(bankName)){
                return bankDetails;
            }
        }
        return null;
    }
}
