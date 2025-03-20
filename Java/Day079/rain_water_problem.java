package Java.Day079;

public class rain_water_problem {

    public static int trappedRainWater(int height[]){
        // calculate left max boundry - array

        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate right max boundry - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedRain = 0;
        int waterLevel = 0;
        // loop
        for(int i = 0; i < n; i++) {
            // waterLevel = min(left max boundry, right max boundry) - height[i]
            waterLevel = Math.min(leftMax[i], rightMax[i]) - height[i];
            trappedRain += waterLevel;
        }
        return trappedRain;

    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3};
        int ans = trappedRainWater((height));
        System.out.println(ans);
    }
}
