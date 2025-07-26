package Day206;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int[] nums2 = {4, 4, 4, 6, 6, 7, 7, 7, 7};

        System.out.println("Top 2 frequent elements: " + topKFrequent(nums1, 2));
        System.out.println("Top 1 frequent elements: " + topKFrequent(nums2, 1));
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Max heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());

        List<Integer> result = new ArrayList<>();
        while (k-- > 0 && !maxHeap.isEmpty()) {
            result.add(maxHeap.poll().getKey());
        }

        return result;
    }
}
