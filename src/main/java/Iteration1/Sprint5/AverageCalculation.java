package Iteration1.Sprint5;
import java.util.Scanner;

        public class AverageCalculation{
            public static void main(String[] args) {

                int as = assignmentScore(), ps= projectScore(), qs=quizScore(), mts=midTermScore(), fes=finalExamScore();
                float aw= assignmentWeight(as), pw=projectWeight(ps), qw=quizWeight(qs), mtw=midTermWeight(mts), few=finalExamWeight(fes);
                float OverallWeight=(aw+pw+qw+mtw+few);
                System.out.println("The overall weight is " + OverallWeight + "%");

            }
            public static int assignmentScore() {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter assignment score: ");
                int assignmentScore = s.nextInt();
                System.out.println(assignmentScore);
                return assignmentScore;
            }
            public static float assignmentWeight(int assignmentScore) {

                float assignmentWeight=(assignmentScore*0.10f);
                System.out.println(assignmentWeight);
                return assignmentWeight;
            }
            public static int projectScore() {

                Scanner s = new Scanner(System.in);
                System.out.println("Enter project score: ");
                int projectScore = s.nextInt();
                System.out.println(projectScore);
                return projectScore;
            }
            public static float projectWeight(int projectScore){

                float projectWeight=(projectScore*0.35f);
                System.out.println(projectWeight);
                return projectWeight;
            }
            public static int quizScore() {

                Scanner s = new Scanner(System.in);
                System.out.println("Enter quiz score: ");
                int quizScore = s.nextInt();
                System.out.println(quizScore);
                return quizScore;
            }
            public static float quizWeight(int quizScore){

                float quizWeight=(quizScore*0.10f);
                System.out.println(quizWeight);
                return quizWeight;
            }
            public static int midTermScore(){

                Scanner s=new Scanner(System.in);
                System.out.println("Enter midterm score: ");
                int midTermScore=s.nextInt();
                System.out.println(midTermScore);
                return midTermScore;
            }
            public static float midTermWeight(int midTermScore){

                float midTermWeight=(midTermScore*0.15f);
                System.out.println(midTermWeight);
                return (midTermWeight);
            }
            public static int finalExamScore(){

                Scanner s=new Scanner (System.in);
                System.out.println("Enter final exam score: ");
                int finalExamScore=s.nextInt();
                System.out.println(finalExamScore);
                return finalExamScore;
            }
            public static float finalExamWeight(int finalExamScore){

                float finalExamWeight=finalExamScore*0.30f;
                System.out.println(finalExamWeight);
                return finalExamWeight;
            }
        }
