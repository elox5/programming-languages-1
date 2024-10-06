import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("You entered: " + name);

        for (int i = name.length() - 1; i >= 0; i--) {
            char c = name.charAt(i);
            System.out.println(c);
        }

        scanner.close();
    }
}