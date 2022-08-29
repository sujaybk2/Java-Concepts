package Iteration1.Sprint4;//Ron and Steve are playing a reverse number game where one has to give an integer to the other.
//The other person receiving the integer needs to reverse the number and display output.
//If any one of them fails to reverse the number, the game ends.
//Write a program to reverse the number, store the reversed number in a variable, and print it.

import java.util.Scanner;

public class Sprint4LoopPracticeTask2ReverseDigits
{
    public static void main(String[] args)
    {
        //-----------------------First line is scanner---------------------
        Scanner x = new Scanner(System.in);
        //-----------------------Variable Declaration Starts---------------
        int num, reversed =0;
        //System.out.println("Enter a number: " + num);
        //-----------------------Variable Declaration Ends-----------------
        //-----------------------Below take input from the user------------
        System.out.println("Enter any number");
        num=x.nextInt();
        //-----------------------End of taking Input from user------------------------
        //-----------------------Logic Starts (such as if, for, while, switch, etc)---
        while (num != 0)
        {
            int rem=num%10;
            reversed=reversed*10+rem;
            num=num/10;
        }
        //-----------------------Logic Ends-------------------------------------------
        //-----------------------Output Begins (Print Statements)---------------------
        System.out.println("The reverse of the number is: " + reversed);
        }
    }