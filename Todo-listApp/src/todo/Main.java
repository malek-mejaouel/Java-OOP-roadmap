package todo;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Task> tasks = new ArrayList<>();
    public void addTask() {
        System.out.print("Enter task description: ");
        String d = input.nextLine();
        Task t = new Task(d);
        tasks.add(t);
        System.out.println("Task added!");
    }
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    public void markTaskDone() {
        viewTasks();
        System.out.print("Enter task number to mark as done: ");
        int x = input.nextInt() - 1;
        input.nextLine(); // clear buffer

        if (x >= 0 && x < tasks.size()) {
            tasks.get(x).markAsDone();
            System.out.println("Task marked as done!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
    public void deleteTask() {
        viewTasks();
        System.out.print("Enter task number to delete: ");
        int x = input.nextInt() - 1;
        input.nextLine(); // clear buffer

        if (x >= 0 && x < tasks.size()) {
            System.out.print("Are you sure to delete it [YES/NO]: ");
            String reply = input.nextLine();
            if (reply.equalsIgnoreCase("YES")) {
                tasks.remove(x);
                System.out.println("Task deleted!");
            }
        } else {
            System.out.println("Invalid task number.");
        }
    }
    public static void main(String[] args) {
        Main app = new Main();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ToDo List App ---");
            System.out.println("1: Add a task");
            System.out.println("2: View all tasks");
            System.out.println("3: Mark a task as done");
            System.out.println("4: Delete a task");
            System.out.println("5: Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    app.addTask();
                    break;
                case 2:
                    app.viewTasks();
                    break;
                case 3:
                    app.markTaskDone();
                    break;
                case 4:
                    app.deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
