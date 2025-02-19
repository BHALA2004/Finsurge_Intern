package Day10.personalLoan;

import Day9.payslip.Validate;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation extends Validate {
    public static boolean validatePersonName(String employeeName){
        Pattern pattern = Pattern.compile("^([A-Z][a-z]*)+( [A-Z][a-z]*)*$");
        Matcher matcher = pattern.matcher(employeeName);
        return matcher.matches();
    }

    public static boolean validateBankName(String bankName){
        Pattern pattern = Pattern.compile("^([A-Z][a-z]+)+( [A-Z][a-z]+)*");
        Matcher matcher = pattern.matcher(bankName);
        return matcher.matches();
    }

    public static boolean findBank(List<BankDetails> bankDetailsList,String bankName){
        for (BankDetails bankDetails : bankDetailsList){
            if(bankDetails.getBankName().equalsIgnoreCase(bankName)){
                return true;
            }
        }
        return false;
    }

    public static BankDetails findBankObject(List<BankDetails> bankDetailsList,String bankName){
        for (BankDetails bankDetails : bankDetailsList){
            if(bankDetails.getBankName().equalsIgnoreCase(bankName)){
                return bankDetails;
            }
        }
        return null;
    }

    public static int yearsIntoMonts(int year){
        int months = 0;
        while (year>0){
            months+=12;
            year-=12;
        }
        return months;
    }

    public static float rateIntoYears(int rate){
        return (float) rate/1200;
    }

    public static float calculateInterest(long principal,float rate,int year){
        float step1 =(float) Math.pow((1+rate),year);
        float step2 = principal*rate*step1;
        float step3 = (float) (Math.pow((1+rate),60))-1;
        return step2/step3;
    }




}
