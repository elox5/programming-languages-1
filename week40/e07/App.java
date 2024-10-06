import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            boolean isLongEnough = password.length() >= 8;
            boolean containsUppercase = false;
            boolean containsLowercase = false;
            boolean containsDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    containsUppercase = true;
                } else if (Character.isLowerCase(c)) {
                    containsLowercase = true;
                } else if (Character.isDigit(c)) {
                    containsDigit = true;
                }
            }

            if (isLongEnough && containsUppercase && containsLowercase && containsDigit) {
                System.out.println("Password is valid");
                break;
            } else {
                System.out.println(
                        "Password is invalid. It must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit");
            }
        }

        scanner.close();
    }
}