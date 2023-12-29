import java.util.Scanner;

public class QueueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new Queue<>();

        while (true) {
            System.out.println("\n1) Add item\n2) Show Queue items in odd positions\n3) Show Queue items in even positions\n4) Exit program");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item: ");
                    String item = scanner.nextLine();
                    queue.enqueue(item);
                    break;
                case 2:
                    System.out.println("Queue items in odd positions: " + queue.oddListings());
                    break;
                case 3:
                    System.out.println("Queue items in even positions: " + queue.evenListings());
                    break;
                case 4:
                    System.out.println("Goodbye");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }
    }
}
