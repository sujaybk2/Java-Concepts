package library;

public class BookImp1 {
    public static void main(String [] args){
        Book1 obj = new Book1();
        obj.setAuthorName("xyz");
        obj.setBookTitle("2 States");
        obj.setISBN(1234);
        obj.setYearOfPublication(1995);
        obj.display();
    }
}
