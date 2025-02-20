package day12.invoicebill;

import java.util.*;

public class Billing implements Billcalculator,BillGenerator{
    @Override
    public Map<String, Double> calculateBill(long units) {
        TreeMap<String, Double> map = new TreeMap<>();
        Double sum = 0.00;
        boolean f1 = true;
        boolean f2 = true;
        boolean f3 = true;
        boolean f4 = true;
            if (units >= 0 && units < 100) {
                map.put("Total Amount = ", 0.00);
                return map;
            }
        if (units >= 100 && f1) {
            units -= 100;
            sum += 0;
            f1 = false;
            map.put("100 Units", 0.00);
        }
        if (units > 0 && f2) {
            long temp = Math.min(units, 400);
            units -= temp;
            sum += temp * 6.50;
            f2 = false;
            map.put(temp + " Units", temp * 6.50);
        }
        if (units > 0 && f3) {
            long temp = Math.min(units, 500);
            units -= temp;
            sum += temp * 8.00;
            f3 = false;
            map.put(temp + " Units", temp * 8.00);
        }
        if (units > 0 && f4) {
            sum += units * 9.00;
            f4 = false;
            map.put(units + " Units", units * 9.00);
        }
        map.put("Total", sum);
        TreeMap<String ,Double> treeMap = map;
        return treeMap;
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
