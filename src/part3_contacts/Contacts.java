package part3_contacts;
import java.util.Scanner;
public class Contacts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array for contacts and number of real contacts
        String[] contacts = new String[1000];
        int count = 0;

        int choice = -1;
        while (choice != 0) {
            // Main menu
            System.out.println();
            System.out.println("1 - Add contacts");
            System.out.println("2 - Show contacts");
            System.out.println("3 - Search");
            System.out.println("4 - Edit contact");
            System.out.println("5 - Delete contact");
            System.out.println("6 - Delete all");
            System.out.println("7 - Add sample contacts");
            System.out.println("0 - Exit");
            System.out.print("Choose: ");
            choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                // Add contacts until empty line or "x"
                System.out.println("Enter contacts (empty line or x to finish):");
                String line = scanner.nextLine();
                while (!line.equals("") && !line.equals("x")) {
                    contacts[count] = line;
                    count++;
                    line = scanner.nextLine();
                }
            } else if (choice == 2) {
                // Show contacts
                for (int i = 0; i < count; i++) {
                    System.out.println((i + 1) + ". " + contacts[i]);
                }
            } else if (choice == 3) {
                // Search
                System.out.print("Enter search phrase: ");
                String phrase = scanner.nextLine();
                for (int i = 0; i < count; i++) {
                    if (contacts[i].contains(phrase)) {
                        System.out.println((i + 1) + ". " + contacts[i]);
                    }
                }
            } else if (choice == 4) {
                // Edit contact
                System.out.print("Enter contact number: ");
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= 1 && number <= count) {
                    System.out.println("Contact: " + contacts[number - 1]);
                    System.out.print("Enter new value: ");
                    contacts[number - 1] = scanner.nextLine();
                } else {
                    System.out.println("Wrong number");
                }
            } else if (choice == 5) {
                // Delete contact
                System.out.print("Enter contact number: ");
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= 1 && number <= count) {
                    contacts[number - 1] = "DELETED";
                } else {
                    System.out.println("Wrong number");
                }
            } else if (choice == 6) {
                // Delete all
                for (int i = 0; i < count; i++) {
                    contacts[i] = "";
                }
            } else if (choice == 7) {
                // Sample contacts
                contacts[count] = "Anna Kovalenko +380501112233";
                count++;
                contacts[count] = "Bohdan Shevchenko +380671234567";
                count++;
                contacts[count] = "Olena Melnyk olena@example.com";
                count++;
            }
        }
        System.out.println("Bye!");
    }
}
