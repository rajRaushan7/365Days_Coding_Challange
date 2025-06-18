package Java.Day169;

import java.util.*;

public class EmailWordFrequencyAnalyzer {

    public static void main(String[] args) {
        String[] emails = {
            "Hello! This is Raj. I hope you are doing well.",
            "Raj is working on a Java project at the moment.",
            "Project deadlines are coming soon, and Raj is ready!"
        };

        Set<String> stopWords = new HashSet<>(Arrays.asList(
            "the", "is", "in", "at", "of", "a", "and", "to"
        ));

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String email : emails) {
            String cleaned = email.toLowerCase().replaceAll("[.,!?]", "");
            String[] words = cleaned.split("\\s+");

            for (String word : words) {
                if (!stopWords.contains(word)) {
                    frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get Top 3 Most Frequent Words
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(frequencyMap.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\nTop 3 Most Frequent Words:");
        for (int i = 0; i < Math.min(3, sorted.size()); i++) {
            Map.Entry<String, Integer> entry = sorted.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " - " + entry.getValue());
        }
    }
}