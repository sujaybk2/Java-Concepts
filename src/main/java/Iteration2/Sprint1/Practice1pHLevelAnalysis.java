package Iteration2.Sprint1;
import java.util.Scanner;
public class Practice1pHLevelAnalysis {
    public static void main(String [] args){
        float phValue;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the pH value: ");
        phValue = scannerObj.nextFloat();
        if (phValue<=7)
            {
            System.out.println("The pH value is low, adjust water soon.");
            }
        else if (phValue > 7 && phValue <=8)
            {
            System.out.println("The pH value is proper.");
            }
        else {
            System.out.println("The pH value is high, adjust water soon.");
        }

    }
}
