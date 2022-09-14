package Iteration2.Sprint5;
import java.util.Scanner;
public class CreatePassword {
    public static void main(String [] args){
       System.out.println("Enter your password");
       Scanner s= new Scanner(System.in);
       String pwd = s.next();
       System.out.println("Enter username");
       String name=s.next();
       if(pwd.length()<15 && pwd.equals("password@123") && name.equals("james"))
       {
           System.out.println("Valid Password");
           System.out.println("Welcome " + name.toUpperCase());
       }
       else
       {
           System.out.println("Invalid Password");
       }
    }
}
