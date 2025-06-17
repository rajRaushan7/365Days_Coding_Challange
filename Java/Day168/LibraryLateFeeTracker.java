package Java.Day168;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LibraryLateFeeTracker {

    public static void main(String[] args) throws ParseException {
        String[] logs = {
            "B101,01-01-2025,20-01-2025",
            "B102,05-01-2025,15-01-2025",
            "B103,10-01-2025,30-01-2025"
        };

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        List<String> lateBooks = new ArrayList<>();
        int totalFee = 0;

        for (String log : logs) {
            String[] parts = log.split(",");
            String bookID = parts[0];
            Date borrowDate = sdf.parse(parts[1]);
            Date returnDate = sdf.parse(parts[2]);

            int daysBorrowed = calculateDays(borrowDate, returnDate);
            int lateDays = daysBorrowed - 14;

            if (lateDays > 0) {
                int fee = lateDays * 2;
                System.out.println("Book " + bookID + " is " + lateDays + " days late. Fee: ₹" + fee);
                totalFee += fee;
                lateBooks.add(bookID);
            }
        }

        System.out.println("Total late fee collected: ₹" + totalFee);
        System.out.println("Books returned late: " + lateBooks);
    }

    // Assuming each month has 30 days and each year has 360 days
    public static int calculateDays(Date start, Date end) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(start);
        c2.setTime(end);

        int day1 = c1.get(Calendar.DATE);
        int month1 = c1.get(Calendar.MONTH);
        int year1 = c1.get(Calendar.YEAR);

        int day2 = c2.get(Calendar.DATE);
        int month2 = c2.get(Calendar.MONTH);
        int year2 = c2.get(Calendar.YEAR);

        int totalDays1 = day1 + month1 * 30 + year1 * 360;
        int totalDays2 = day2 + month2 * 30 + year2 * 360;

        return totalDays2 - totalDays1;
    }
}