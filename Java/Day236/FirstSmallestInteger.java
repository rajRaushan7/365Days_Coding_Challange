// you have given an array of integers and you have to find the minimum shortest number missing from that array
// eg: [3, 4, -1, 1]  => output: 2 (because 2 is missing from that array)

package Java.Day236;

import java.util.Arrays;

public class FirstSmallestInteger {
    public static void main(String args[]) {
        int[] arr = {3, 4, -1, 1};
        Arrays.sort(arr);

        int m = 1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == m){
                m = m+1;
            }
            if(arr[i] > m){
                break;
            }
        }
        

        System.out.print("The missing integer is: ");
        System.out.println(m);
    }
}