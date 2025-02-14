package Day7.pattern;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternPractice {
    public static void main(String[] args) {

        //GitLink -> https://chatgpt.com/c/67ada1e0-ec94-8005-a2d8-3da05e5e457d
        String regex = ".s";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("as");
        System.out.println(matcher.find());
    }
}
