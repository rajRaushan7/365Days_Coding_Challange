public class PasswordStrengthChecker {
    public static void main(String[] args) {
        String password = "Hello@123";

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() >= 8) {
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpper = true;
                else if (Character.isLowerCase(ch)) hasLower = true;
                else if (Character.isDigit(ch)) hasDigit = true;
                else if ("!@#$%^&*()-+".contains(String.valueOf(ch))) hasSpecial = true;
            }
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
}