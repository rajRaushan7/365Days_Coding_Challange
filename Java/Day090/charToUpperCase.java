package Java.Day090;

class charToUpperCase {

    public static void toUpperCase(String str) {
        StringBuilder s = new StringBuilder("");
        s.append(Character.toUpperCase(str.charAt(0)));
        for (int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1) {
                s.append(str.charAt(i));
                i++;
                s.append(Character.toUpperCase(str.charAt(i)));
            } else {
                s.append(str.charAt(i));
            }
        }
        s.toString();
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "hi my name is raj ";
        toUpperCase(str);
    }
}