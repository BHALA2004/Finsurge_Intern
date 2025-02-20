package day11.educationalloan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculationImplementation calculationImplementation = new CalculationImplementation();
        List<BankDetails> bankDetailsList = new ArrayList<>();
        for (int i = 0;i<4;i++){
            BankDetails bankDetails1 = calculationImplementation.getBankDetails();
            bankDetailsList.add(bankDetails1);
        }
        calculationImplementation.setBankDetailsArrayList(bankDetailsList);
        StudentDetails studentDetails1 = calculationImplementation.getStudentDetails();
        calculationImplementation.print(studentDetails1);
    }
}
