/*
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

Input Format:
The first line contain an integer, T, denoting the number of test cases. Each test case T, is comprised of a single line which an integer, n, which can arbitrarily large or small.

Output Format:
For each input variable n and approproate primitive dataType, you must determine if the given primitives are capable of storing it. If yes, then print:
n can be fitted in:
* dataType

If there is more than one appropriate data type one appropriate data type, print each one on its own line and order them by size.
If the number cannot be stored in one of the four aforementioned primitives, print the line:
n can't be fitted anywhere.
*/

import java.util.*;
// import java.io.*;

class java_datatype {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>= -32768 && x<= 32767)System.out.println("* short");
                double n1 = Math.pow(2, 31);
                if(x>= -n1 && x<= (n1-1))System.out.println("* int");
                double n2 = Math.pow(2, 63);
                if(x>= -n2 && x<= (n2 - 1))System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        sc.close();
        }
    }
}



