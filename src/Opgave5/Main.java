package Opgave5;

public class Main {

    Library library = new Library("Hillerød Library");


    Book harryPotter = new Book("Harry Potter","Patrick Jensen",true);
    Book opera = new Book("Opera","Patrick Jensen",true);
    Book cleopatra = new Book("Cleopatra","Patrick Jensen",true);
    Book viola = new Book("Viola","Patrick Jensen",true);
    Book dune = new Book("Dune","Patrick Jensen",true);

    void main(){
        library.addBook(harryPotter);
        library.addBook(opera);
        library.addBook(cleopatra);
        library.addBook(viola);
        library.addBook(dune);

        Book book1 = library.findBookByTitle("Harry Potter");
        if (book1.available()){
            book1.borrow();
        }


        library.findAvailableBooks();

        book1.returnBook();

        library.findAvailableBooks();

        library.printAllBooks();


    }
}
