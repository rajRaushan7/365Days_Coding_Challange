package Java.Day135;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java programming is really enjoyable";
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");
        String[] words = sentence.split(" ");

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}