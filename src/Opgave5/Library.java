package Opgave5;
import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: "+book.getTitle());
    }

    public void findAvailableBooks() {
        for (Book book : books) {
            if (book.available()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void printAllBooks(){
        for (Book book : books){
            System.out.println(book.getTitle());
        }
    }
}
