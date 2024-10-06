import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Palindrome test, please enter some text: ");
        String original = scanner.nextLine();

        String text = original.toLowerCase().replaceAll("[^a-z]", "");
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if (text.equals(reversed)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }

        scanner.close();
    }
}