//To keep track of its customers, Wat-a-Pizza wishes to store the details of its customer in its database. Write a
//program that stores each person's personal details and order history. The program should also calculate the bill amount
//for each item ordered.
import java.sql.SQLOutput;
import java.util.Scanner;
public class WatAPizza
{
    public static void main(String[] args)
    {
        //-----------------------First line is scanner---------------------
        Scanner x=new Scanner(System.in);
        //-----------------------Variable Declaration Starts---------------------
        String customerName, customerEmail, address;
        int phoneNo, noOfPizzasOrdered, noOfGarlicBreadOrdered, noOfBeveragesOrdered;
        double priceOfPizza= 12.99, priceOfGarlicBread= 5.99, priceOfBeverage= 1.99;
        char size='M';
        double y= (priceOfPizza*noOfPizzasOrdered) + (priceOfGarlicBread*noOfGarlicBreadOrdered) + (priceOfBeverage*noOfBeveragesOrdered);
        //-----------------------Variable Declaration Ends---------------------
        //-----------------------Below take input from the user----------------
        System.out.println("Enter Customer's Name");
        customerName= x.nextLine();
        System.out.println("Enter Customer's Email address");
        customerEmail=x.nextLine();
        System.out.println("Enter Customer's home address");
        address=x.nextLine();
        System.out.println("Enter Customer's phone number");
        phoneNo=x.nextInt();
        System.out.println("Enter the number of pizzas you wish to order");
        noOfPizzasOrdered=x.nextInt();
        System.out.println("Enter the number of garlic bread you wish to order");
        noOfGarlicBreadOrdered=x.nextInt();
        System.out.println("Enter the number of beverages you wish to order");
        noOfBeveragesOrdered=x.nextInt();
        //-----------------------End of taking Input from user---------------------------------------------------------
        //-----------------------Logic Starts (such as if, for, while, switch, etc)------------------------------------
        //-----------------------Logic Ends----------------------------------------------------------------------------
        //-----------------------Output Begins (Print Statements)----------------------------
        System.out.println("Serial number \t"+"Item category \t"        );
        System.out.println("1 \t"+  "\t\t\tPizza");
        System.out.println("2 \t"+ "\t\t\tGarlic Bread" );
        System.out.println("3 \t"+ "\t\t\tBeverages");
        System.out.println("Enter your choice");
        int choice = x.nextInt();
        if(choice==1) {
            System.out.println("Your total pizza amount is $" + (priceOfPizza*noOfPizzasOrdered));
        } else  if(choice==2){
            System.out.println("The total garlic bread amount is $" + (priceOfGarlicBread*noOfGarlicBreadOrdered));
        } else {
            System.out.println("The total beverage amount is $" + (priceOfBeverage*noOfBeveragesOrdered));
        }

        System.out.println("Your total bill is $" + y);




    }
}
        //-----------------------Output Ends (Print Statements)--------------------------------------------------------
        //-----------------------Now, run the code---------------------------------------------------------------------

