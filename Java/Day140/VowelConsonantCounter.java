public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello World! 123";
        input = input.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}