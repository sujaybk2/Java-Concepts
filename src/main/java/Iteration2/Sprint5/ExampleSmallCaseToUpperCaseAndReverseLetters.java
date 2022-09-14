package Iteration2.Sprint5;

public class ExampleSmallCaseToUpperCaseAndReverseLetters{
    public static void main(String [] args)
{
String s="Welcome You All";
System.out.println(s.substring(8));
System.out.println(s.replace("You All","Wave 35"));
String s1= "";
for(int i= s.length()-1;i>=0;i--){
    s1=s1+s.charAt(i);
}
System.out.println(s1);
String[] names={"sachin","saurav","shewag"};
        for(int i=0;i<names.length;i++)
        {
        System.out.println(names[i].substring(0,1).toUpperCase()+names[i].substring(1).toLowerCase());
        }
}
}

