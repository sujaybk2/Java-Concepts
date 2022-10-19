//package Iteration2.Sprint3;
//
//
//public class NestedLoop {
//    public static void main(String[] args) {
//        int[] arr={ 11,22,3,5,7};
//        int[] resArr=new int[arr.length];
//        NestedLoop nl=new NestedLoop();
//        Practice1SortingAge n2 = new Practice1SortingAge();
//        resArr = n2.getSortedAge();
//        resArr=nl.sortedArr(arr);
//        for(int i=0;i<resArr.length;i++)
//        {
//            System.out.println(resArr[i]);
//        }
//    }
//
//
//
//
//
//
//
//        public int[] sortedArr(int[] arr)
//    {
//        int temp;
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr.length-i-1;j++)
//            {
//                if(arr[j]<arr[j+1])
//                {
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        return arr;
//    }
//
//}