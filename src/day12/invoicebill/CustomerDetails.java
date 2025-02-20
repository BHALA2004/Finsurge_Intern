package day12.invoicebill;
import java.util.Map;
import java.util.Scanner;

public class CustomerDetails {
    public static int id = 0;
    private int customerId;
    private String customerName;

    private ElectricityBillDetails electricityBillDetails;

    static Scanner scanner = new Scanner(System.in);

    public CustomerDetails() {
        this.customerId = ++id;
    }

    public CustomerDetails(String customerName, ElectricityBillDetails electricityBillDetails) {
        this.customerName = customerName;
        this.electricityBillDetails = electricityBillDetails;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ElectricityBillDetails getElectricityBillDetails() {
        return electricityBillDetails;
    }

    public void setElectricityBillDetails(ElectricityBillDetails electricityBillDetails) {
        this.electricityBillDetails = electricityBillDetails;
    }

    public static CustomerDetails getCustomerDetails(){
        CustomerDetails customerDetails = new CustomerDetails();
        System.out.println("Enter Customer Name :");
        String customerName ;
        while (true){
            customerName = scanner.nextLine();
            if(Validation.validatePersonName(customerName)){
                customerDetails.setCustomerName(customerName);
                break;
            }
            else {
                System.out.println("Invalid!Enter Valid:");
            }
        }
        ElectricityBillDetails electricityBillDetails1 = new ElectricityBillDetails().getElectricityBillDetails();
        customerDetails.setElectricityBillDetails(electricityBillDetails1);
        return customerDetails;

    }
}
