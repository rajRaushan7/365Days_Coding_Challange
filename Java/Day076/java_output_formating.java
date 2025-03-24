/*
Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
To get you started, a portion of the solution is provided form you in the editor:
you must format and print the input to complete the solution. 
*/

import java.util.Scanner;

public class java_output_formating {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String s = s1 + x;
                //Complete this line
                System.out.printf("%-14s %03d%n", s1, x);
            }
            System.out.println("================================");
            sc.close();
    }
}