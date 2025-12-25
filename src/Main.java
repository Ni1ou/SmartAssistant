import model.*;
import service.ItemService;

import java.util.Scanner;

public class Main {

    private static int idCounter = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ItemService service = new ItemService();
        boolean running = true;

        while (running) {
            System.out.println("""
                    \n--- Smart Assistant ---
                    1. Add item
                    2. Show items
                    3. Mark done
                    4. Suggestions
                    5. Exit
                    """);

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addItem(scanner, service);
                case "2" -> service.showAllItems();
                case "3" -> {
                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        service.markItemDone(id);
                    } catch (Exception e) {
                        System.out.println("Wrong input!");
                    }
                }
                case "4" -> service.showSuggestions();
                case "5" -> running = false;
                default -> System.out.println("Wrong choice!");
            }
        }
    }

    private static void addItem(Scanner scanner, ItemService service) {

        System.out.println("1.Task  2.Habit  3.Reminder");
        String type = scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();

        switch (type) {
            case "1" -> {
                System.out.print("Deadline: ");
                service.addItem(new Task(idCounter++, title, scanner.nextLine()));
            }
            case "2" -> service.addItem(new Habit(idCounter++, title));
            case "3" -> {
                System.out.print("Remind date: ");
                service.addItem(new Reminder(idCounter++, title, scanner.nextLine()));
            }
        }
    }
}
