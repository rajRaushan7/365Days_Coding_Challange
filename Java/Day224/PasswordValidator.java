package Day224;

public class PasswordValidator {

    public static void main(String[] args) {
        checkPassword("Hello@123");
        checkPassword("weakpass");
    }

    public static void checkPassword(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "@#$%&!*";

        if (password.length() >= 8) {
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpper = true;
                else if (Character.isLowerCase(ch)) hasLower = true;
                else if (Character.isDigit(ch)) hasDigit = true;
                else if (specialChars.indexOf(ch) != -1) hasSpecial = true;
            }
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial && password.length() >= 8) {
            System.out.println("Password is valid.");
        } else {
            System.out.print("Password is invalid. Missing: ");
            if (!hasUpper) System.out.print("uppercase, ");
            if (!hasLower) System.out.print("lowercase, ");
            if (!hasDigit) System.out.print("digit, ");
            if (!hasSpecial) System.out.print("special character, ");
            if (password.length() < 8) System.out.print("minimum length 8, ");
            System.out.println();
        }
    }
}
