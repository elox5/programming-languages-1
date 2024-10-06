import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String total = "";

        while (true) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();
            if (name.equals("Quit")) {
                break;
            }

            total += name;

            System.out.println(total);
        }

        scanner.close();
    }
}