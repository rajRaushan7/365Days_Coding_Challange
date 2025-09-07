package Java.Day247;

public class DublicateIntegers {
    public static boolean dublicateIntegers(int nums[]){
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
