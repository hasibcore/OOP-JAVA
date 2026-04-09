package librarymanager;
public class Book {
    private int bookId;
    private String title;
    private double price;
public static int totalBooksCreated;
    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        //or int totalBooksCreated=0;;; = totalBooksCrated++;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printDetails()
    {
        System.out.println(bookId+" "+price+" "+title);
    }
}
