import java.util.ArrayList;

public class Member {
    private static int idCounter = 1; // auto increment
    private int id;
    private String name;
    private String secretCode;
    private ArrayList<Book> borrowedBooks;

    // Constructor
    public Member(String name, String secretCode) {
        this.id = idCounter++;
        this.name = name;
        this.secretCode = secretCode;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSecretCode() { return secretCode; }
    public ArrayList<Book> getBorrowedBooks() { return borrowedBooks; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setSecretCode(String secretCode) { this.secretCode = secretCode; }
    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) { this.borrowedBooks = borrowedBooks; }

    @Override
    public String toString() {
        return "Member {" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", SecretCode='" + secretCode + '\'' +
                ", BorrowedBooks=" + borrowedBooks.size() +
                '}';
    }
}
