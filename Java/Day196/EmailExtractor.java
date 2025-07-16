package Java.Day196;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class EmailExtractor {

    public static void main(String[] args) {
        String filePath = "emails.txt"; // Make sure this file exists

        Set<String> emails = new TreeSet<>();

        // Regex pattern for valid email
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    emails.add(matcher.group());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        if (emails.isEmpty()) {
            System.out.println("No valid emails found.");
        } else {
            System.out.println("Extracted Emails:");
            for (String email : emails) {
                System.out.println(email);
            }
        }
    }
}
