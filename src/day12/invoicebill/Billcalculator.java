package day12.invoicebill;

import java.util.Map;

public interface Billcalculator {

    Map<String,Double> calculateBill(long units);

}
