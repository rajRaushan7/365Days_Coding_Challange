package Java.Day112;

public class singleNum {
    int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
}
