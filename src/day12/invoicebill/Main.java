package day12.invoicebill;

public class Main {
    public static void main(String[] args) {
        CustomerDetails customerDetails = CustomerDetails.getCustomerDetails();
        Billing billing = new Billing();
        billing.generateBill(customerDetails);
    }
}
