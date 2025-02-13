package Day7;
import java.text.DecimalFormat;

public class SplitProgram {
    private static final String[] tensNames = {
            "", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"
    };

    private static final String[] numNames = {
            "", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine",
            " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"
    };

    private static String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20) {
            current = numNames[number % 100];
            number /= 100;
        } else {
            current = numNames[number % 10];
            number /= 10;

            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " hundred" + current;
    }

    public static String convert(int number) {
        if (number == 0) { return "zero"; }

        String snumber = Integer.toString(number);

        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        snumber = df.format(number);
        System.out.println(snumber);

        int billions = Integer.parseInt(snumber.substring(0, 3));
        int millions = Integer.parseInt(snumber.substring(3, 6));
        int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
        int thousands = Integer.parseInt(snumber.substring(9, 12));

        String tradBillions = billions > 0 ? convertLessThanOneThousand(billions) + " billion " : "";
        String tradMillions = millions > 0 ? convertLessThanOneThousand(millions) + " million " : "";
        String tradHundredThousands = hundredThousands > 0 ? convertLessThanOneThousand(hundredThousands) + " thousand " : "";
        String tradThousand = convertLessThanOneThousand(thousands);

        return (tradBillions + tradMillions + tradHundredThousands + tradThousand).trim();
    }

    public static void main(String[] args) {
        int number = 250;
        System.out.println(number + " in words: " + convert(number));
    }
}