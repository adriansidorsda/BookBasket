public class Book {

    private String bookName;
    private String authorName;
    private int price;

    public Book(String bookName, String authorName, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
