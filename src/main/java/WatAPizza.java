//To keep track of its customers, Wat-a-Pizza wishes to store the details of its customer in its database. Write a
//program that stores each person's personal details and order history. The program should also calculate the bill amount
//for each item ordered.
import java.util.Scanner;
public class WatAPizza
{
    public static void main(String[] args)
    {
        String customerName="Gary", customerEmail="gary@123.com", address= "20 Marble Drive Eville";
        int phoneNo=412312345, NoOfPizzasOrdered=5, noOfGarlicBreadOrdered=3, noOfBeveragesOrdered=3;
        double priceOfPizza= 12.99, priceOfGarlicBread= 5.99, priceOfBeverage= 1.99;
        char size='M';
        double y= (priceOfPizza*NoOfPizzasOrdered) + (priceOfGarlicBread*noOfGarlicBreadOrdered) + (priceOfBeverage*noOfBeveragesOrdered);
        Scanner x=new Scanner(System.in);
        System.out.println(
                "Sl No      Item Category" +
                "------------------------" +
                " 1) Pizza" +
                " 2) Garlic Bread" +
                " 3) Beverages" +
                " Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
        y=x.nextDouble();
        System.out.println(y);



    }
}
