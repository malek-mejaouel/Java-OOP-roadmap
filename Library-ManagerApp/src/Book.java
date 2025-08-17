public class Book {
    private static int idCounter = 1; // auto-increment IDs
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.id = idCounter++;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // new book is available by default
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setAvailable(boolean available) { this.isAvailable = available; }

    @Override
    public String toString() {
        return "Book {" +
                "ID=" + id +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Available=" + isAvailable +
                '}';
    }
}
