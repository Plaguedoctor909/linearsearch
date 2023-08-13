import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EnqueueDequeueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to enqueue: ");
                    int enqueueValue = scanner.nextInt();
                    queue.add(enqueueValue);
                    System.out.println(enqueueValue + " enqueued.");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        int dequeuedValue = queue.poll();
                        System.out.println(dequeuedValue + " dequeued.");
                    } else {
                        System.out.println("Queue is empty. Cannot dequeue.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }
    }
}
