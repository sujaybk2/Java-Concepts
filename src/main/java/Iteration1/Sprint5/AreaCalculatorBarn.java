package Iteration1.Sprint5;
import java.util.Scanner;
public class AreaCalculatorBarn {
        public double calculateAreaOfSquare(double side)
        {return side*side;}
        public double calculateAreaOfCircle(double radius)
        {return radius*radius*3.14;}
        public double calculateAreaOfRectangle(double length, double width)
        {return length*width;}

        public static void main(String [] args){
            Scanner s = new Scanner(System.in);
            System.out.println("What is the side of the square? ");
            double side= s.nextDouble();
            System.out.println("What is the radius of the circle? ");
            double radius= s.nextDouble();
            System.out.println("What is the length of the rectangle?");
            double length= s.nextDouble();
            System.out.println("What is the width of the rectangle?");
            double width= s.nextDouble();

            AreaCalculatorBarn areaCalculatorBarn = new AreaCalculatorBarn();

            System.out.println("The area of the square is " + areaCalculatorBarn.calculateAreaOfSquare(side) + " squared units.");
            System.out.println("The area of the circle is " + areaCalculatorBarn.calculateAreaOfCircle(radius) + " squared units.");
            System.out.println("The area of the rectangle is " + areaCalculatorBarn.calculateAreaOfRectangle(length,width) + " squared units.");

        }
    }

