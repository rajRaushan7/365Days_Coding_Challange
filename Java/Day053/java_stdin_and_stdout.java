/*
Task:
In this challenge, you mest read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To meke the problem a little easier, a protion of the code is provided for you in the editor below.

Input Format:
There are 3 lines of input, and each line contains a single integer.
*/
// package Java.Day054;

import java.util.*;
public class java_stdin_and_stdout{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt(); // Complete this line
        int c = scan.nextInt(); // Complete this line

        System.out.println(a);
        System.out.println(b); // Complete this line
        System.out.print(c); // Complete this line

        scan.close();
    }
}