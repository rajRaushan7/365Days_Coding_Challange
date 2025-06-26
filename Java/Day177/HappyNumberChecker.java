package Java.Day177;

import java.util.*;

public class HappyNumberChecker {

    public static void main(String[] args) {
        int n1 = 19;
        int n2 = 4;

        checkHappyNumber(n1);
        System.out.println();
        checkHappyNumber(n2);
    }

    public static void checkHappyNumber(int n) {
        Set<Integer> seen = new HashSet<>();
        System.out.print(n);

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
            System.out.print(" → " + n);
        }

        if (n == 1) {
            System.out.println("\nHappy Number!");
        } else {
            System.out.println("\nNot a Happy Number.");
        }
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}