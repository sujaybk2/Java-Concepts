package Sprint4;

public class AddEvenNumbers {
    //Write the logic to add evens in the methods
    public long addEvens(int n)
    {
        if(n<=0)
        {return 0;

        }
        if(n%2==0)
        {
            return n+addEvens(n-1);
        }
        else{
            return addEvens(n-1);
        }
    }
    public static void main(String[] args) {
        // Initialize the object of AddEven class
        AddEvenNumbers addEven = new AddEvenNumbers();
        // Declare a variable to give as input to the addEvens method

        // Call the addEvens method and display the result

    }


}


