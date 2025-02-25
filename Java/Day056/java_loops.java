/*
We use the integers a, b, and n to create the following series:
(a + 2^0 . b). (a + 2^1 . b). .... (a + 2^0 . b + 2^1 . b + ... + 2^n-1 . b)
You are given q queries in the form of a, b and n. For each query, print the series corresponding to the given a, b and n values as a single line of n space-separated integers.

Input Format:
The first line contains an integer. q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.

Output Format:
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integeres.
*/

import java.util.*;
import java.io.*;

public class java_loops {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 1; j <= n; j++){
                int sum;
                sum = a;
                int m;
                m = 1;
                for (int k = 1; k <= j; k++){
                    sum += (m * b);
                    m = (2 * m);
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}