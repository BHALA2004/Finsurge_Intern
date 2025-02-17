package Day8.Date;

import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String milliseconds ;
        System.out.println("Enter Seconds:");
        BigInteger bigInteger ;
        while (true){
            milliseconds=scanner.next();
            if(Validate.validate(milliseconds)){
                bigInteger = new BigInteger(milliseconds);
                break;
            }
            else {
                System.out.println("Invalid,Enter Valid:");
            }
        }

        long seconds = bigInteger.longValue();
        Instant instant = Instant.ofEpochMilli(seconds);

        LocalDateTime localDateTime = instant.atZone(ZoneId.of("UTC")).toLocalDateTime();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = localDateTime.format(dateTimeFormatter);
        System.out.println(date);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date1 = localDateTime.format(dateTimeFormatter1);
        System.out.println(date1);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date3 = localDateTime.format(dateTimeFormatter2);
        System.out.println(date3);

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-ns");
        String date4 = localDateTime.format(dateTimeFormatter3);
        System.out.println(date4);

        System.out.println(localDateTime.getMonth()+" "+localDateTime.getDayOfMonth()+","+localDateTime.getYear());


    }
}
