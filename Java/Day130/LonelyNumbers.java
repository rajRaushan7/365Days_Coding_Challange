import java.util.*;

public class LonelyNumbers {

    public static List<Integer> findLonely(List<Integer> nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Step 1: Count the frequency of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check for lonely numbers
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1 && !countMap.containsKey(num - 1) && !countMap.containsKey(num + 1)) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 6, 5, 8);
        List<Integer> lonelyNumbers = findLonely(nums);
        System.out.println("Lonely numbers: " + lonelyNumbers);
    }
}