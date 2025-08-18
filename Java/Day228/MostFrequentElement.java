package Day228;

import java.util.HashMap;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3};
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        // Step 1: Count frequency
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Find element with max frequency
        int maxFreq = 0;
        int mostFrequent = -1;
        
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > maxFreq) {
                maxFreq = freqMap.get(key);
                mostFrequent = key;
            }
        }
        
        System.out.println("Most frequent element is: " + mostFrequent);
    }
}
