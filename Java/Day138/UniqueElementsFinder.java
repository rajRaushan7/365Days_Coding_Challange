import java.util.*;

public class UniqueElementsFinder {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 4, 1, 3, 2, 5};
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (freqMap.get(num) == 1) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}