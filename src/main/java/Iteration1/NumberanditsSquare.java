package Iteration1;

import java.util.Scanner;
public class NumberanditsSquare {
    public static void main(String[] args)
    {
        float i;
        //The above declaration can also be "int 1" should you wish to make it a whole number
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number that needs to be squared : ");
        i=x.nextFloat();
        System.out.println(i);
        System.out.println(i*i);

    }

}
