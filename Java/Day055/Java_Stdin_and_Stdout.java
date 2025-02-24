/*
In this challange, you must read an integer, a double and a String from stdin, then print the values according to the instructions in the Output Format section below. 
To make the problem a little easier, a portion of the code is provided for you in the editor. 

Input Format:
There are three lines of input:
1. The first line contains an integer.
2. The second line contains a double.
3. The third line contains a String.

Output Format:
There are three line of output:
1. On the first line, print 'String: ' followed by the unaltered String read from stdin.
2. On the second line, print 'Double: ' followed by the unaltered String read from stdin.
3. On the third line, print 'Int: ' followed by the unaltered integer read from stdin.
*/

import java.util.Scanner;

public class Java_Stdin_and_Stdout {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}