package Iteration1;//This Program is to check if the number is positive or negative

import java.util.Scanner;
    public class PosORNegative


{
    public static void main(String[] args)
    {
    int no=-1,j;
    //String a="abc";
    //char s='a';
        //below the scanner will initialize for j
        Scanner objforj = new Scanner(System.in);
        System.out.println("Enter your number");
        j = objforj.nextInt();
        //below if the condition checks if the no variable number is greater than zero, and returns as a positive number if condition is true
            if(no>=0 )
            {
            System.out.println("The no initialized variable by Sujay in the code is positive");
            }
            else if(no<0)
            {
            System.out.println("The no initialized variable by Sujay in the code is negative");
            }

            //below condition is for j
        if(j>0) {
            System.out.println("You entered a Positive Number");
                }
        else if(j<0)
                {
            System.out.println("You entered a negative number");
                }
        else
                {
            System.out.println("Try something else");
                }


    }
}
