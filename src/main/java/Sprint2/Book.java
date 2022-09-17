package Sprint2;

public class Book {
    String title;
    String authorName;
    int ISBN;

    void display()
    {
        System.out.println("title:  " + title);
        System.out.println("author name: " + authorName);
        System.out.println("ISBN number: " + ISBN);
    }
    class Demo
    {
        public static void main(String[] args) {
            Book obj=new Book();
            obj.title="Two States";
            obj.authorName = "Chetan Bhagat";
            obj.ISBN = 1234;
            obj.display();
        }
    }
}
