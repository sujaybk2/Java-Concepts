package Sprint4;

//John has to add all numbers between 1-100. Use loop to complete.
class LoopPracticeTask1 {
    public static void main(String[] args) {
        int p;
        int sum=0;
        for (p=1;p<=100; p+=1)// initialize --> condition ---> code of the loop --> updation ---> condition ---> (if true) code of the loop ---> updation
            {
            sum=sum+p;
        }

        System.out.println(sum);
    }
}
