/*
Given a string s, and indices, start and end, print a substring consisting of all characters in the inclusive range from start to end -1.
*/

import java.util.*;

public class javaSubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String part = S.substring(start, end);
        System.out.print(part);
        in.close();
    }
}