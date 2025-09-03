package Java.Day243;

import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        List<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[n-1];
        leaders.add(maxFromRight);

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Leaders are collected in reverse order
        Collections.reverse(leaders);
        System.out.println(leaders);
    }
}