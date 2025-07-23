package Java.Day203;
import java.util.*;
public class RainWater {
    public static void main(String args[]){
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++){
            if(height[i] > max){
                max = height[i];
                leftMax[i] = height[i];
            } else{
                leftMax[i] = max;
            }
        }
        max = Integer.MIN_VALUE;
        for(int j = height.length - 1; j >= 0; j--){
            if(height[j] > max){
                max = height[j];
                rightMax[j] = height[j];
            } else{
                rightMax[j] = max;
            }
        }
        int waterTrap = 0;
        for(int k = 0; k < height.length; k++){
            waterTrap += Math.min(leftMax[k], rightMax[k]) - height[k];
        }
        System.out.println("Total Water Trap : "+waterTrap);
    }
}
