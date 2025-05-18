package Day137;

public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "The quick brown fox, jumped over the lazy dog!";
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");
        String[] words = sentence.split("\\s+");

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}
