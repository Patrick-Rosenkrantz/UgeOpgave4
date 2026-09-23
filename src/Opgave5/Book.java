package Opgave5;

public class Book {
    private String title;
    private String author;
    private boolean available;

    Book(String title,String author,boolean available){
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean available() {
        return available;
    }

    public void borrow(){
        if (available()){
            available = false;
            System.out.println("Borrowing: "+title);
        } else {
            System.out.println(title + " is not available");
        }
    }

    public void returnBook(){
        available = true;
        System.out.println("Returning: "+title);

    }

    public String toString(){
        return "Title: "+ title + " Author: " + author + " Available: "+ available;
    }
}
