//To keep track of its customers, Wat-a-Pizza wishes to store the details of its customer in its database. Write a
//program that stores each person's personal details and order history. The program should also calculate the bill amount
//for each item ordered.
import java.util.Scanner;
public class WatAPizza
{
    public static void main(String[] args)
    {
        String customerName="Gary", customerEmail="gary@123.com", address= "20 Marble Drive Eville";
        int phoneNo=412312345, noOfPizzasOrdered=5, noOfGarlicBreadOrdered=3, noOfBeveragesOrdered=3;
        double priceOfPizza= 12.99, priceOfGarlicBread= 5.99, priceOfBeverage= 1.99;
        char size='M';
        double y= (priceOfPizza*noOfPizzasOrdered) + (priceOfGarlicBread*noOfGarlicBreadOrdered) + (priceOfBeverage*noOfBeveragesOrdered);
        Scanner x=new Scanner(System.in);
        System.out.println("Serial number \t"+"Item category \t"        );
        System.out.println("1 \t"+  "\t\t\tPizza");
        System.out.println("2 \t"+ "\t\t\tGarlic Bread" );
        System.out.println("3 \t"+ "\t\t\tBeverages");
        System.out.println("Enter your choice");
        int choice = x.nextInt();
        if(choice==1) {
        double pizzaBill= priceOfPizza*noOfPizzasOrdered;
        System.out.println("Total Pizza bill is "+ pizzaBill);
    } else  if(choice==2){
            System.out.println("The total garlic bill price is $" + priceOfGarlicBread*noOfGarlicBreadOrdered);
        } else {
            System.out.println("The price of the beverage is $"+ priceOfBeverage*noOfBeveragesOrdered);
        }

        System.out.println("Your total bill is $" + y);




    }
}
