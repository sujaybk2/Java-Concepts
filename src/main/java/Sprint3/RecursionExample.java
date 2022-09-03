package Sprint3;
/*WAP with recursive method multiplyEvens that returns the product of the given first "n" even integers,
for example, multiplyEvens(1) must return 1
             multiplyEvens(9) must return 384
 */
public class RecursionExample
{
public static void main(String [] args)
{
   System.out.println("GM");
   msg(10);
   System.out.println("GN");
}
public static void msg(int num)
{
    if(num==0)
    {
        return;
    }
    System.out.println("Welcome");
    msg(num/2);
}
}
