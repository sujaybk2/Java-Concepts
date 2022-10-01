package library;

public class Book1 {
    private String bookTitle;
    private int ISBN;
    private int yearOfPublication;
    private String authorName;

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void display()
    {
        System.out.println(bookTitle + " " + ISBN + " " + yearOfPublication + " " + authorName + " ");
    }
}
