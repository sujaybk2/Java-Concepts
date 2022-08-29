package Sprint1;
////Steve is the coach of a soccer team. He has asked Ron who is one of the team members, to find the oldest player from
////the list of players. Help Ron write a programto calculate the maximum age from the given array that holds the age of
////all the players on the team.
////23, 34, 33, 24, 25, 26, 31
//// Java Program to find maximum in arr[]
class ArrayPractice2MaximumNumber {
    //{
//    static int arr[] = {23, 34, 33, 24, 25, 26, 31};
//
//    // Method to find maximum in arr[]
//    static int largest()
//    {
//        int i;
//
//        // Initialize maximum element
//        int max = arr[0];
//
//        // Traverse array elements from second and
//        // compare every element with current max
//        for (i = 1; i < arr.length; i++)
//            if (arr[i] > max)
//                max = arr[i];
//
//        return max;
//    }
//
//    // Driver method
//    public static void main(String[] args)
//    {
//        System.out.println("Largest in given array is " + largest());
//    }
//}
//
//
    public static void main(String[] args) {
        int[] soccerPlayerAge = {23, 34, 33, 24, 25, 26, 31};
        for (int i = 0; i < soccerPlayerAge.length; i++) {
            System.out.println(soccerPlayerAge[i]);
        }
    }
}