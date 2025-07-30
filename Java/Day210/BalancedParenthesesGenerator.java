package Java.Day210;

public class BalancedParenthesesGenerator {

    public static void main(String[] args) {
        int n = 3;
        System.out.println("All combinations of " + n + " pairs of balanced parentheses:");
        generateParentheses(n);
    }

    public static void generateParentheses(int n) {
        backtrack("", 0, 0, n);
    }

    public static void backtrack(String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            System.out.println(current);
            return;
        }

        if (open < max) {
            backtrack(current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(current + ")", open, close + 1, max);
        }
    }
}
