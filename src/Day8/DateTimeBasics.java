package Day8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeBasics {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String string = localDate.format(dateTimeFormatter);
        System.out.println(string);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After Formatting: " + formattedDate);

        LocalTime localTime1 = LocalTime.of(10,10,10);
        LocalTime localTime2 = LocalTime.of(12,10,10);

        Duration duration = Duration.between(localTime1,localTime2);
        System.out.println(duration.toHoursPart());
        System.out.println(duration.toMinutesPart());
        System.out.println(duration.toSecondsPart());

        LocalDate localDate1 = LocalDate.of(2023,12,3);
        LocalDate localDate2 = LocalDate.of(2026,2,1);

        Period period = Period.between(localDate1,localDate2);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }
}
