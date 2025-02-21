package day12.invoicebill;

import java.util.*;

public class Billing implements Billcalculator,BillGenerator{
    @Override
    public Map<String, Double> calculateBill(long units) {
        TreeMap<String, Double> billDetails = new TreeMap<>();
        Double totalAmount = 0.0;
        // First 100 units are free
        if (units <= 100) {
            billDetails.put("First 100 Units", 0.0);
            totalAmount = 0.0;
            billDetails.put("Total Amount", totalAmount);
        } else if (units <= 200) {
            billDetails.put("First 100 Units", 0.0);
            billDetails.put("Next 100 Units:", (units - 100) * 2.25);
            totalAmount = (units - 100) * 2.25;
            billDetails.put("Total Amount", totalAmount);
        } else if (units <= 400) {
            billDetails.put("First 100 Units", 0.0);
            billDetails.put("Next 100 Units:", (100 * 2.25));
            billDetails.put("Next 200 Units:", (units - 200) * 4.50);
            totalAmount = (100 * 2.25) + (units - 200) * 4.50;
            billDetails.put("Total Amount", totalAmount);
        } else if (units <= 500) {
            billDetails.put("First 100 Units", 0.0);
            billDetails.put("Next 100 Units:", (100 * 2.25));
            billDetails.put("Next 200 Units:", (200 * 4.50));
            billDetails.put("Next 400 Units:", (units - 400) * 6.00);
            totalAmount = (100 * 2.25) + (200 * 4.50) + (units - 400) * 6.00;
            billDetails.put("Total Amount", totalAmount);
        } else {
            billDetails.put("First 100 Units", 0.0);
            billDetails.put("Next 100 Units:", (100 * 2.25));
            billDetails.put("Next 200 Units:", (200 * 4.50));
            billDetails.put("Next 400 Units:", (100 * 6.00));
            billDetails.put("Remaining Units:", (units - 500) * 8.00);
            totalAmount = (100 * 2.25) + (200 * 4.50) + (100 * 6.00) + (units - 500) * 8.00;
            billDetails.put("Total Amount", totalAmount);
            billDetails.put("Total", totalAmount);


        }
        TreeMap<String, Double> treeMap = billDetails;
        return billDetails;
    }

    @Override
    public void generateBill(CustomerDetails customerDetails){
        System.out.println("------------------------------------");
        System.out.printf("%-20s: %s\n", "Customer ID", customerDetails.getCustomerId());
        System.out.printf("%-20s: %s\n", "Customer Name", customerDetails.getCustomerName());

        ElectricityBillDetails electricityBillDetails = customerDetails.getElectricityBillDetails();
        System.out.printf("%-20s: %d %s\n", "Units Consumed", electricityBillDetails.getCustomerUnitsUsed(), "units");
        System.out.printf("%-20s: %s\n", "Bill ID", electricityBillDetails.getBillId());
        for (Map.Entry<String, Double> entry : electricityBillDetails.getUnitSeperation().entrySet()) {
            System.out.printf("%-20s: %c%.2f\n", entry.getKey(), '₹', entry.getValue());
        }
        System.out.println("Thank You!");
        System.out.println("------------------------------------");


    }
}
