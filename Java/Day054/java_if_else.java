/*
Task:
Given an integer, n, perform the following conditionsl actions:
1. If n is odd, print Weird
2. If n is even and in the inclusive range of 2 to 5, print Not Weird
3. n is even and in the inclusive range of 6 to 20, print Weird.
4. If n is even and greater than 20, print Not Weird
Complete tehstyb code provided in your editor to print whether or not n is weird.

Input Format:
A single line containing a positive integer, n.

Output Format:
Print Weird if the number is weird, otherwise print Not Weird.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class java_if_else {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0 || (N % 2 == 0 && N >= 6 && N <= 20)){
            System.out.print("Weird");
        } else {
            System.out.print("Not Weird");
        }
        scanner.close();
    }
}