package day12.invoicebill;

import java.util.Map;
import java.util.Scanner;

public class ElectricityBillDetails {

    static Scanner scanner = new Scanner(System.in);
    Billing billing = new Billing();

    private static int id = 0;
    private int billId ;
    private long customerUnitsUsed;

    private Map<String,Double> unitSeperation;

    public ElectricityBillDetails() {
        this.billId = ++id;
    }

    public ElectricityBillDetails(long customerUnitsUsed, Map<String,Double> unitSeperation) {

        this.customerUnitsUsed = customerUnitsUsed;
        this.unitSeperation = unitSeperation;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public long getCustomerUnitsUsed() {
        return customerUnitsUsed;
    }

    public void setCustomerUnitsUsed(long customerUnitsUsed) {
        this.customerUnitsUsed = customerUnitsUsed;
    }

    public Map<String,Double> getUnitSeperation() {
        return unitSeperation;
    }

    public void setUnitSeperation(Map<String,Double> unitSeperation) {
        this.unitSeperation = unitSeperation;
    }

    public ElectricityBillDetails getElectricityBillDetails(){
        ElectricityBillDetails electricityBillDetails = new ElectricityBillDetails();
        System.out.println("Total Number of units:");
        long customerUnits;
        while (true){
            try {
                customerUnits = scanner.nextLong();
                if(customerUnits>=0){
                    electricityBillDetails.setCustomerUnitsUsed(customerUnits);
                    break;
                }
                else {
                    System.out.println("Invalid,Enter Valid:");
                }
            }
            catch (Exception e){
               System.out.println("Invalid,Enter Valid");
               scanner.next();
            }
        }
        Map<String,Double> hashMap = billing.calculateBill(customerUnits);
        electricityBillDetails.setUnitSeperation(hashMap);
        return electricityBillDetails;
    }
}
