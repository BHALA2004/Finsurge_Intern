package Day8.Strings;

import java.util.*;

class StringMethods{
    public static int countVowels(String string){
        List<Character> list = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int count=0;
        for (char i : string.toCharArray()){
            if(Character.isLetter(i) && list.contains(Character.toLowerCase(i))){
                count++;
            }
        }
        return count;
    }

    public static void findUpperCaseCharacter(String s){
        boolean flag = true;
        for (char c : s.toCharArray()){
            if(Character.isLetter(c) && Character.isUpperCase(c)){
                System.out.print(c+" ");
                flag = false;
            }
        }
        if(flag){
            System.out.print("Not Present");
        }
        System.out.println();
    }

    public static void findLowerCaseCharacter(String s){
        boolean flag = true;
        for (char c : s.toCharArray()){
            if(Character.isLetter(c) && Character.isLowerCase(c)){
                System.out.print(c+" ");
                flag=false;
            }
        }
        if(flag){
            System.out.print("Not Present");
        }
        System.out.println();
    }

    public static int findParticularCharacterCount(String s,char c){
        int count = 0;
        for(char m : s.toCharArray()){
            if(c==m){
                count++;
            }
        }
        return count;
    }

    public static int findBlankSpaceCount(String s,char c){
        int count = 0;
        for (char m : s.toCharArray()){
            if(c==m){
                count++;
            }
        }
        return count;
    }
}
public class StringImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String string = scanner.nextLine();
        System.out.println("1.Count Vowels\n"+"2.Find Upper Case Character\n"+"3.Find Lower Case Charcter\n"+"4.Find Particular Character Count\n"+"5.Find Blank Space Count\n"+"Exit\n");
        String option;
        int optionValue ;
        while (true) {
            System.out.println("Enter Option:");
            while (true) {
                option = scanner.next();
                if (option.matches("\\d{1}") && Integer.parseInt(option) > 0 && Integer.parseInt(option) < 7) {
                    optionValue = Integer.parseInt(option);
                    break;
                }
                else {
                    System.out.println("Invalid,Enter Valid:");
                }
            }
            if (optionValue == 1) {
                System.out.println("Count Vowels = "+ StringMethods.countVowels(string));
            } else if (optionValue == 2) {
                StringMethods.findUpperCaseCharacter(string);
            } else if (optionValue == 3) {
                StringMethods.findLowerCaseCharacter(string);
            } else if (optionValue == 4) {
                System.out.println("Enter Character to find frequency:");
                scanner.nextLine(); // Consume leftover newline

                String k;
                char m ;
                while (true) {
                    k = scanner.next();
                    if (k.matches("^.$")) {  // Corrected regex to check a single alphabet character
                        m = k.charAt(0);
                        break;
                    } else {
                        System.out.println("Invalid, Enter a valid character:");
                    }
                }

                // Call method after loop ends
                System.out.println(StringMethods.findParticularCharacterCount(string, m));
            } else if (optionValue == 5) {
                System.out.println("Find Blank Space Count = " + StringMethods.findBlankSpaceCount(string, ' '));
            } else if (optionValue == 6) {
                break;
            }
            else {
                System.out.println("Invalid,Enter Valid Number:");
            }
        }
    }
}
