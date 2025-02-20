package day12.invoicebill;

import java.util.HashMap;
import java.util.Map;

public class Billing implements Billcalculator,BillGenerator{
    @Override
    public Map<String, Double> calculateBill(long units){
        Map<String,Double> map = new HashMap<>();
        Double sum = 0.00;
        while (true){
            if(units<=100){
                units=units-100;
                sum+=0;
                map.put(String.valueOf(100),0.00);
            }if (units>100 && units<=500) {
                long temp = Long.min(units,500);
                units=units-temp;
                sum+=units*6.50;
                map.put(String.valueOf(temp),units*6.50);
            }
            if(units>500 && units<=1000){
                long temp = Long.min(units,1000);
                units=units-temp;
                sum+=units*8.00;
                map.put(String.valueOf(units),units*8.00);
            }
            if (units>1000){
                sum+=units*9.00;
                map.put(String.valueOf(units),units*9.00);
            }
            map.put("Total",sum);
            if(units<=0){
                break;
            }


        }
        return map;
    }

    @Override
    public void generateBill(CustomerDetails customerDetails){

    }
}
