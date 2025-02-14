package Day8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeBasics {
    public static void main(String[] args) {

        //Date Creation
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //Time Creation
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //Time and Date Creation
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Formatting Date
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String string = localDate.format(dateTimeFormatter);
        System.out.println(string);

        //Formatting Date and TIme with Day
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");


        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After Formatting: " + formattedDate);

        //Difference between Time
        LocalTime localTime1 = LocalTime.of(10,10,10);
        LocalTime localTime2 = LocalTime.of(12,10,10);

        Duration duration = Duration.between(localTime1,localTime2);
        System.out.print(duration.toHoursPart()+" ");
        System.out.print(duration.toMinutesPart()+" ");
        System.out.print(duration.toSecondsPart()+" ");

        System.out.println();
        //Difference Between Date
        LocalDate localDate1 = LocalDate.of(2023,12,3);
        LocalDate localDate2 = LocalDate.of(2026,2,1);

        Period period = Period.between(localDate1,localDate2);
        System.out.print(period.getDays()+" ");
        System.out.print(period.getMonths()+" ");
        System.out.print(period.getYears()+" ");

        LocalDate givenDate = LocalDate.of(2025,02,13);
        if(givenDate.isBefore(LocalDate.now())){
            System.out.println("Before Date");
        }

        //Instant
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
