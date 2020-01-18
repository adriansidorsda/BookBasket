import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Book> books = new ArrayList<>();

    public Book createBook(String bookName, String authorName, int price) {
        return new Book(bookName, authorName, price);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void clearAll(){
        books.clear();
    }

    public int calculateGeneralPrice(){
        int generalPrice = 0;

        for (Book book: books) {
            generalPrice =+ book.getPrice();
        }

        return generalPrice;
    }

}
