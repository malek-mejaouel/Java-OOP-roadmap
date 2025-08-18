import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add book
    public void addBook(String x,String y) {
        Book b = new Book(x,y);
        books.add(b);
        System.out.println("✅ Book added!");
    }

    // Display books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books yet...");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    // Remove book
    public void removeBook() {
        displayBooks();
        if (books.isEmpty()) return;

        System.out.print("Enter book number to delete: ");
        int x = input.nextInt() - 1;
        input.nextLine();

        if (x >= 0 && x < books.size()) {
            System.out.print("Are you sure to delete it [YES/NO]: ");
            String reply = input.nextLine();
            if (reply.equalsIgnoreCase("YES")) {
                books.remove(x);
                System.out.println("❌ Book deleted!");
            } else {
                System.out.println("❌ Deletion cancelled.");
            }
        } else {
            System.out.println("❌ Invalid book number.");
        }
    }

    // Search book
    public void searchBook() {
        System.out.print("Enter title to search: ");
        String keyword = input.nextLine();
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with title containing: " + keyword);
        }
    }
}
