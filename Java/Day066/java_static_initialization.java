/*
You are given a class Solution with a main method. Complete the given code so that it outputs the area  of a parallelogram with breadth B and height H. You should read the variables from the standard input.
If B or H is less then 0, the output should be "java.lang.Exception: Breadth and height must positive" without quotes.

Input Format:
There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.

Output Format:
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
// Write your code here
    public static Scanner sc = new Scanner(System.in);
    public static int B = sc.nextInt();
    public static int H = sc.nextInt();
    public static boolean flag = (B>0 && H > 0);
    static {
        if(!flag){
        System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

