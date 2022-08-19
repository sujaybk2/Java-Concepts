//Ron and Steve are playing a reverse number game where one has to give an integer to the other.
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
        System.out.println("Enter a number");
        //-----------------------Variable Declaration Starts---------------
        int num = x.nextInt();
        int rev = 0;
        while (num != 0);
        {
            int div=num%10;
            rev=rev*10+div;
            num=num/10;
        }
        String customerName, customerEmail, address;
//        int phoneNo, noOfPizzasOrdered=0, noOfGarlicBreadOrdered=0, noOfBeveragesOrdered=0;
//        double priceOfPizza= 12.99, priceOfGarlicBread= 5.99, priceOfBeverage= 1.99;
//        char size='M';
//        double orderSummary= (priceOfPizza*noOfPizzasOrdered) + (priceOfGarlicBread*noOfGarlicBreadOrdered) + (priceOfBeverage*noOfBeveragesOrdered);
        System.out.println("The reverse of the number is: ");
            //-----------------------Variable Declaration Ends-----------------

            //-----------------------Below take input from the user------------

            //-----------------------End of taking Input from user------------------------

            //-----------------------Logic Starts (such as if, for, while, switch, etc)---

            //-----------------------Logic Ends-------------------------------------------

            //-----------------------Output Begins (Print Statements)---------------------
        }
    }