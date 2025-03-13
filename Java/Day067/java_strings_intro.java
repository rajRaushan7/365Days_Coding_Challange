/*
Given two strings of lowercase English letters. A and B, perform the following operations: 
1. Sum the lengths of A and B.
2. Determine if A is lexicographically larger than B (i.e. B comes before A in the dictionary).
3. Capitalize the first letter in A and B and print them on a single line.

Input Format: 
The first line contains a string A. The second line contains another string B.
The string are comprised of only lowercase English letter.

Output Format:
There are three lines of output:
For the first line, sum of the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*/


import java.util.*;

public class java_strings_intro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n1 = A.length() + B.length();
        int ans = A.compareTo(B);
        String a = A.substring(0, 1).toUpperCase() + A.substring(1);
        String b = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(n1);
        if(ans > 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        System.out.print(a + " " + b);
    }
}



