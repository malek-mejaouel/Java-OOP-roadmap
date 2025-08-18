import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;

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
    public static Member login(String secretCode, String Members_file){
        try(BufferedReader reader= new BufferedReader(new FileReader(Members_file))){
            String line ;
            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");
                if(data.length == 2 && data[1].equals(secretCode)){
                    return new Member(data[0],data[1]);
                }
            }
        }
        catch (IOException e) {
            System.out.println("No members file found , creatinng one at the moment...");
        }
        return null;
    }
    public static void saveMember(Member member,String Member_file){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(Member_file,true))){
            writer.write(member.getName() + "," + member.getSecretCode());
            writer.newLine();
        }
        catch (IOException e){
            System.out.println("Error while saving Member");
        }
    }
}
