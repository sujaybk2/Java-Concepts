package Sprint4;

import java.util.Scanner;

    public class HasibProfessorExample
    {
        public static void main(String[] args)
        {
            int totalMarks=TotalMarks();
            int avgMarks=AverageMarks(totalMarks,3);
            System.out.println("The student's total marks is: " + totalMarks);
            System.out.println("The student's average marks is: " + avgMarks);
            String grade=getGrades(avgMarks);
            System.out.println("The student's grade is: " + grade);
        }
        public static int TotalMarks()
        {
            int totMarks=0;
            for(int i=1;i<=3;i++)
            {
                int subM=getMarksOfSubject();
                totMarks=totMarks+subM;
            }
            return totMarks;
        }
        public static int getMarksOfSubject()
        {
            Scanner s =new Scanner(System.in);
            System.out.println("Enter the student's marks ");
            int marks=s.nextInt();
            return marks;
        }
        public static int AverageMarks(int totM,int noOfSub)
        {
            int avg=totM/noOfSub;
            return avg;
        }
        public static String getGrades(int avg)
        {
            if(avg>80)
            {
                return "A";
            }
            else if(avg>60)
            {
                return "B";
            }
            else if(avg>40)
            {
                return "Pass";
            }
            else
            {
                return "Fail";
            }
        }
    }

