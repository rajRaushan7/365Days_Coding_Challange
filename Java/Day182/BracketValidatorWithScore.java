package Java.Day182;

import java.util.*;

public class BracketValidatorWithScore {

    public static void main(String[] args) {
        checkAndScore("{[()()]}");    // Balanced
        checkAndScore("{[(])}");      // Not Balanced
        checkAndScore("[()]");        // Balanced
        checkAndScore("{[()]}()");    // Balanced
    }

    public static void checkAndScore(String s) {
        Stack<Integer> scoreStack = new Stack<>();
        Stack<Character> bracketStack = new Stack<>();

        Map<Character, Character> pairs = Map.of(
            ')', '(', 
            ']', '[', 
            '}', '{'
        );

        Map<Character, Integer> values = Map.of(
            '(', 1,
            '[', 2,
            '{', 3
        );

        for (char c : s.toCharArray()) {
            if (values.containsKey(c)) {
                bracketStack.push(c);
                scoreStack.push(0); // start new context
            } else if (pairs.containsKey(c)) {
                if (bracketStack.isEmpty() || bracketStack.pop() != pairs.get(c)) {
                    System.out.println("Not Balanced");
                    return;
                }

                int innerScore = 0;
                while (!scoreStack.isEmpty() && scoreStack.peek() != 0) {
                    innerScore += scoreStack.pop();
                }
                scoreStack.pop(); // remove the 0 marker
                scoreStack.push(Math.max(1, innerScore) * values.get(pairs.get(c)));
            }
        }

        if (!bracketStack.isEmpty()) {
            System.out.println("Not Balanced");
        } else {
            int totalScore = 0;
            while (!scoreStack.isEmpty()) {
                totalScore += scoreStack.pop();
            }
            System.out.println("Balanced\nScore: " + totalScore);
        }
    }
}