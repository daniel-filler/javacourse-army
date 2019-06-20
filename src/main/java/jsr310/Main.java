package jsr310;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        LocalTime.now()
//        LocalDateTime
        LocalDate now = LocalDate.now();
        LocalDate tomorrow = now.plusDays(1);
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.FRANCE));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.FRANCE));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.JAPAN));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));
        LocalDate localDate = now.withYear(1980);
        System.out.println("localDate = " + localDate);
        LocalDate jeka = LocalDate.of(1978, 10, 3);
        LocalDate itay = LocalDate.of(2000, 10, 4);
        long between = ChronoUnit.MONTHS.between(jeka, itay);
        System.out.println("between = " + between);



    }
}
