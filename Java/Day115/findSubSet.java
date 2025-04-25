package Java.Day115;

public class findSubSet {
    public static void main(String[] args){
        subSets("abc", "", 0);
    }

    public static void subSets(String str, String ans, int i){
        // base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        // Yes Choice
        subSets(str, ans + str.charAt(i), i+1);

        // No Choice
        subSets(str, ans, i+1);
    }
}