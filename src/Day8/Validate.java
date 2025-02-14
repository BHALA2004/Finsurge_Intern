package Day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean validate(String string){
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
