package day12.invoicebill;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean validatePersonName(String employeeName){
        Pattern pattern = Pattern.compile("^([A-Z][a-z]*)+( [A-Z][a-z]*)*$");
        Matcher matcher = pattern.matcher(employeeName);
        return matcher.matches();
    }
}
