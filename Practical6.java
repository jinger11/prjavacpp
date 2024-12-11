/*
6. Identify commonalities and differences between Publication, Book and Magazine classes. Title, Price, Copies are common instance variables and saleCopy is common method. The differences are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue, receiveissue().Write a program to find how many copies of the given books are ordered and display total sale of publication
*/
class Publication 
{
    String title;
    double price;
    int copies;

    // Constructor for Publication
    Publication(String title, double price, int copies) 
	{
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    // Common method to display total sale
    void saleCopy() 
	{
        System.out.println("Total sale of " + title + ": " + (price * copies));
    }
}

// Book class extending Publication
class Book extends Publication {
    String author;

    // Constructor for Book
    Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    // Method to order additional copies for the book
    void orderCopies(int newCopies) {
        copies += newCopies;
        System.out.println("Ordered " + newCopies + " new copies of the book.");
    }
}

// Magazine class extending Publication
class Magazine extends Publication {
    String currentIssue;

    // Constructor for Magazine
    Magazine(String title, double price, int copies, String currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    // Method to order additional quantity of magazines
    void orderQty(int newQty) {
        copies += newQty;
        System.out.println("Ordered " + newQty + " new copies of the magazine.");
    }

    // Method to display the current issue of the magazine
    void currentIssue() {
        System.out.println("Current issue of the magazine: " + currentIssue);
    }

    // Method to receive a new issue
    void receiveIssue() {
        System.out.println("Received the new issue of the magazine: " + currentIssue);
    }
}

// Main class
public class Practical6 {
    public static void main(String[] args) {
        // Create objects for Book and Magazine
        Book book1 = new Book("Java Programming", 500.0, 50, "James Gosling");
        Magazine magazine1 = new Magazine("Tech Today", 100.0, 200, "January 2024");

        // Order more copies for both
        book1.orderCopies(20);
        magazine1.orderQty(50);

        // Display total sales for both
        book1.saleCopy();
        magazine1.saleCopy();

        // Display current issue of the magazine
        magazine1.currentIssue();

        // Receive new issue of the magazine
        magazine1.receiveIssue();
    }
}
