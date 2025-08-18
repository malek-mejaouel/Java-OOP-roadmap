import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Main {
    private static final String MEMBERS_FILE = "members.txt";
    private static Scanner input = new Scanner(System.in);
    private static Library newBook = new Library();
    public static void main(String[] args) {
        while (true) {
            System.out.println("===== Library System =====");
            System.out.print("Enter your secret code: ");
            String secretCode = input.nextLine();
            Member currentUser=Member.login(secretCode,MEMBERS_FILE);
            if (currentUser != null) {
                System.out.println("Welcome back, " + currentUser.getName() + "!");
                menuLoop(currentUser);
            } else {
                System.out.println("No member found with that code. Do you want to register? (y/n)");
                String choice = input.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();
                    currentUser = new Member(name, secretCode);
                    Member.saveMember(currentUser,MEMBERS_FILE);
                    System.out.println("Member created successfully! You can login now.");
                }
            }
        }}
        // MENU LOOP
        private static void menuLoop(Member user) {
            boolean running = true;
            while (running) {
                System.out.println("\n===== Menu =====");
                System.out.println("1. Add Book");
                System.out.println("2. View My Books");
                System.out.println("3. Logout");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                String choice = input.nextLine();
                switch (choice) {
                    case "1":
                        System.out.print("Enter book title: ");
                        String title = input.nextLine();
                        System.out.print("Enter author: ");
                        String author = input.nextLine();
                        newBook.addBook(title,author);
                        break;
                    case "2":
                        newBook.displayBooks();
                        break;
                    case "3":
                        System.out.println("Logging out...");
                        running = false;
                        break;
                    case "4":
                        System.out.println("Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }

    }