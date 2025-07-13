package Java.Day194;

import java.util.*;

public class LiveLeaderboard {

    public static void main(String[] args) {
        String[][] submissions = {
            {"alice", "50"},
            {"bob", "40"},
            {"alice", "30"},
            {"david", "70"},
            {"bob", "60"}
        };

        Map<String, Integer> scores = new HashMap<>();

        // Process submissions
        for (String[] entry : submissions) {
            String user = entry[0];
            int score = Integer.parseInt(entry[1]);

            scores.put(user, scores.getOrDefault(user, 0) + score);
        }

        // Sort by score desc, then username asc
        List<Map.Entry<String, Integer>> leaderboard = new ArrayList<>(scores.entrySet());

        leaderboard.sort((a, b) -> {
            if (!Objects.equals(b.getValue(), a.getValue())) {
                return b.getValue() - a.getValue();
            } else {
                return a.getKey().compareTo(b.getKey());
            }
        });

        System.out.println("Leaderboard:");
        int rank = 1;
        for (Map.Entry<String, Integer> entry : leaderboard) {
            System.out.println(rank + ". " + entry.getKey() + " - " + entry.getValue());
            rank++;
        }
    }
}
