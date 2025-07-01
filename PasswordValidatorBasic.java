import java.util.Scanner;

public class PasswordValidatorBasic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasLength = password.length() >= 8;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        if (hasLength && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak.");
        }

        input.close();
    }
}