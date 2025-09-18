public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook("Python Guide", "Guido", 350.0, true);
        lb1.display();
        lb1.borrowBook();
        lb1.display();
        lb1.borrowBook(); // Trying to borrow again
    }
}
