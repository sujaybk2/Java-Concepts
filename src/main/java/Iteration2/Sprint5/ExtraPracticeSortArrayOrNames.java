package Iteration2.Sprint5;

public class ExtraPracticeSortArrayOrNames {
    public static void main(String[] args) {
        String name="sachin";
        ExtraPracticeSortArrayOrNames sort=new ExtraPracticeSortArrayOrNames();
        String UpperName=sort.convertToUpperCase(name);
        System.out.println(UpperName);
        String[] names={"Sujay","Bill","John","Namratha"};
        String[] sortNames=sort.SortNames(names);
        for(int i=0;i<sortNames.length;i++)
        {
            System.out.println(sortNames[i]);
        }

    }
    public String convertToUpperCase(String name)
    {
        return name.toUpperCase();
    }
    public String[] SortNames(String[] names)
    {
        for(int i=0;i<names.length;i++)
        {
            for(int j=0;j<names.length-i-1;j++)
            {
                if(names[j].compareTo(names[j+1])>0)
                {
                    String temp=names[j+1];
                    names[j+1]=names[j];
                    names[j]=temp;
                }
            }
        }
        return names;
    }
}