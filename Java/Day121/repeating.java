package Java.Day121;

public class repeating {
    public static void main(String[] args){
        boolean nonRepeat = false;
        int[] arr = new int[26];
        String str = "statistics";
        for(int i = 0; i<str.length(); i++){
            arr[str.charAt(i) - 'a'] += 1;
        }
        for(int i=0; i<str.length(); i++){
            if(arr[str.charAt(i) - 'a'] == 1){
                nonRepeat = true;
                System.out.println(str.charAt(i));
                break;
            }
        }
        if(!nonRepeat){
            System.out.println("_");
        }
    }
}
