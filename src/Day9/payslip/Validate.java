package Day9.payslip;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean validateEmployeeName(String employeeName){
        Pattern pattern = Pattern.compile("^([A-Z][a-z]*)+( [A-Z][a-z]*)*$");
        Matcher matcher = pattern.matcher(employeeName);
        return matcher.matches();
    }

    public static boolean validateEmployeeCompanyAddress(String companyAddress){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9\s,.-/]+$");
        Matcher matcher = pattern.matcher(companyAddress);
        return matcher.matches();
    }

}
