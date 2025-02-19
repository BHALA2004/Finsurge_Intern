package Day10.personalLoan;

import Day7.task.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankDetails> bankDetailsArrayList = new ArrayList<>();
        for(int i = 0;i<1;i++){
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

            System.out.println("Enter Bank Location:");
            String bankLocation;
            while (true){
                bankLocation=scanner.next();
                if(Validate.validateCollegeLocation(bankLocation)){
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
                    System.out.println("Percent should less than 100");
                }
                }
                catch (Exception e){
                    System.out.println("Invalid,Enter Valid:");
                }
            }
            scanner.nextLine();
            bankDetailsArrayList.add(new BankDetails(bankName,bankLocation,interest));
        }
        LoanDetails.setBankList(bankDetailsArrayList);
        PersonDetails personDetails = new PersonDetails();
        PersonDetails cutomer = personDetails.getDetails();
        PersonDetails.print(cutomer);


    }
}
