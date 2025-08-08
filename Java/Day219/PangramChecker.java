import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];

        // Mark each letter found
        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all letters are present
        boolean isPangram = true;
        for (boolean present : alphabet) {
            if (!present) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is NOT a Pangram.");
        }

        sc.close();
    }
}