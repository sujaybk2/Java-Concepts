package Iteration1.Sprint4;//A teacher gives an eight-digit number to Bob to determine whether each digit is even or odd
//If it is even, then he should display the sum of the even digits
//If it is odd, then he should display the sum of the odd digits

import java.util.Scanner;

public class String4LoopPracticeTask3EvenAndOddNumbers
{
    public static void main(String [] args)
    {
        Scanner x = new Scanner(System.in);
        //-----------------------Variable Declaration Starts--------------------------
        int num=12345678, summation=0;
        //System.out.println("Enter a number: " + num);
        //-----------------------Variable Declaration Ends----------------------------
        //-----------------------Below take input from the user-----------------------
        System.out.println("Enter any number");
        num=x.nextInt();
        //-----------------------End of taking Input from user------------------------
        //-----------------------Logic Starts (such as if, for, while, switch, etc)---


        //-----------------------Logic Ends-------------------------------------------
        //-----------------------Output Begins (Print Statements)---------------------
        System.out.println("The summation of the number is: " + summation);
    }
}
