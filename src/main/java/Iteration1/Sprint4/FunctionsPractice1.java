package Iteration1.Sprint4;
import java.util.Scanner;
public class FunctionsPractice1 {
    public static void main(String [] args){
        int a=0, b=0;
        Scanner x=new Scanner(System.in);
        System.out.println("Please assign a value for a.");
        a=x.nextInt();
        System.out.println("Please assign a value for b.");
        b=x.nextInt();
        System.out.println("The product of a and b is: " + a*b);
        welcome();
        multiply(5,100);
        multiply(2,3);
        multiply(6,8);
        divide(20,5);
        divide(100,10);
        divide(66,11);
    }
    public static void welcome() {
        System.out.println("Welcome to the calculator!");
    }
    public static void multiply(int a, int b){
        System.out.println(a*b);
    }
    public static void divide(int a, int b){
        System.out.println(a/b);
    }
}
