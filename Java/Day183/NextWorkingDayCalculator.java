package Java.Day183;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NextWorkingDayCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        LocalDate date = LocalDate.parse(input);
        LocalDate nextWorkingDay = findNextWorkingDay(date);

        System.out.println("Next working day: " + nextWorkingDay);
    }

    public static LocalDate findNextWorkingDay(LocalDate date) {
        LocalDate nextDay = date.plusDays(1);
        while (isWeekend(nextDay)) {
            nextDay = nextDay.plusDays(1);
        }
        return nextDay;
    }

    public static boolean isWeekend(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }
}