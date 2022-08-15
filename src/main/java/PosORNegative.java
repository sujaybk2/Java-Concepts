//This Program is to check if the number is positive or negative

import java.util.Scanner;
    public class PosORNegative


{
    public static void main(String[] args)
    {
    int no=0, j;
        //below the scanner will initialize for j
        Scanner objforj = new Scanner(System.in);
        j=objforj.nextInt();
        //below if the condition checks if the no variable number is greater than zero, and returns as a positive number if condition is true
            if(no>=0 )
            {
            System.out.println("No variable is positive");
            }
            else if(no<0)
            {
            System.out.println("No variable is negative");
            }

            //below condition is for j
        if(j>=0) {
            System.out.println("You entered a Positive Number");
        } else if(j<0) {
            System.out.println("You entered a negative number");
        }

    }
}
