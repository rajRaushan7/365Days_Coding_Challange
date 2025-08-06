import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int reversed = 0;

        // Logic to reverse the number
        while (number > 0) {
            int digit = number % 10;         // Get the last digit
            reversed = reversed * 10 + digit; // Append digit
            number = number / 10;             // Remove the last digit
        }

        // Check if original and reversed are equal
        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }

        sc.close();
    }
}