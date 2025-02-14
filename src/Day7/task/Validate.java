package Day7.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean validateCollegeName(String collegeName){
        Pattern pattern = Pattern.compile("^([A-Z][a-z]*)+( [A-Z][a-z]*)*$");
        Matcher matcher = pattern.matcher(collegeName);
        return matcher.matches();
    }
    public static boolean validateCollegeCode(String collegeCode){
        int collegeCodeNow = 0;
            Pattern pattern = Pattern.compile("(\\d{4,6})");
            Matcher matcher = pattern.matcher(collegeCode);
            return matcher.matches();
    }

    public static boolean validateCollegeLocation(String collegeLocation){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(collegeLocation);
        return matcher.matches();
    }

    public static boolean validateStudentName(String studentName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+( | [A-Z]|[A-Z][a-z]+)*");
        Matcher matcher = pattern.matcher(studentName.trim()); // Trim before matching
        return matcher.matches();
    }
}
