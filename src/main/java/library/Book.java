package library;

public class Book {
    //below are instance variables
    String bookTitle;
    int ISBN;
    int yearOfPublication;

    public Book(String bookTitle, int ISBN, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.yearOfPublication = yearOfPublication;
    }

    //below are parameterized constructors, meaning there is an argument in the braces
    public void display()
    {
        System.out.println("bookTitle: " + bookTitle);
        System.out.println("ISBN:" + ISBN);
        System.out.println("year of publication: " + yearOfPublication);
    }
}
