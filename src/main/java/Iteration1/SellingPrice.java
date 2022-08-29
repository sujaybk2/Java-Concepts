package Iteration1;//A gift store owner wants to increase the selling price of an item by 5% due to a hike in the price of its raw materials.
//Write a program to calculate the revised selling price of this item.

//import java.util.Scanner

public class SellingPrice
{
    public static void main(String[] args)
    {
        String itemName = "Kaisa Bowl";
        Double sellingPrice = 10.99;
        Double x = 0.05;
        double y = sellingPrice + (sellingPrice*x);
        System.out.println("Revised Selling Price for Rounded Kaisa Bowl is $" + (y));

    }
}
