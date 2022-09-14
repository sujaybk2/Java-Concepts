package Iteration2.Sprint4;
/*WAP with recursive method multiplyEvens that returns the product of the given first "n" even integers,
for example, multiplyEvens(1) must return 1
             multiplyEvens(9) must return 384
 */
public class RecursionExample
{
public static void main(String [] args) {
    int x = evenNo(10);
    System.out.println(x);
    }
public static int evenNo(int num)
{
    if(num==0)
    {
        return 0;
    }
    if(num%2==0)
    {
        return num + evenNo(num-1);
    }
    else
    {
        return evenNo(num-1);
    }
}
}
