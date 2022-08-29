package Sprint1;

public class DemoSumOfEvenNumbers
{
    public static void main(String[] args)
    {
        int sum=0;
        int j=0;
        int[] num = {11, 12, 6, 5, 7};
        for (j = 0; j<num.length;j++) {
            System.out.println(num[j]);
            if (num[j] % 2 == 0) {
                sum = sum + num[j];
            }
        }
        System.out.println("Sum:" + sum);
    }
}