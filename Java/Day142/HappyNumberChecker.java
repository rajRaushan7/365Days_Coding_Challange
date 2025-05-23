import java.util.*;

// A number is called a Happy Number if replacing it with the sum of the squares of its digits repeatedly eventually results in 1. If it loops endlessly in a cycle that does not include 1, then it is an Unhappy Number.

public class HappyNumberChecker {
    public static void main(String[] args) {
        int n = 19;
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSquareSum(n);
        }

        System.out.println(n == 1);
    }

    public static int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}

