public class lowerCaseCount {
    public static void main(String[] args) {
        int count = 0;
        String str = "Some String Count Number of LowerCase Letters In This String";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                count += 1;
            }
        }
        System.out.println("Total number of lowercase characters in the given string is: " + count);
    }
}