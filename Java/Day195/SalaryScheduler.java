package Java.Day195;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class SalaryScheduler {

    public static void main(String[] args) {
        int year = 2025;

        for (int month = 1; month <= 12; month++) {
            LocalDate lastDay = LocalDate.of(year, month, Month.of(month).length(Year.isLeap(year)));

            // If weekend, move back to previous Friday
            while (lastDay.getDayOfWeek() == DayOfWeek.SATURDAY || lastDay.getDayOfWeek() == DayOfWeek.SUNDAY) {
                lastDay = lastDay.minusDays(1);
            }

            String monthName = lastDay.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            String dayName = lastDay.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

            System.out.println(monthName + " " + year + ": " + dayName + ", " + lastDay);
        }
    }
}
