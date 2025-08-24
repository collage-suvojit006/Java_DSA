package Sorting;

import java.util.Arrays;

public class Cycle_Sort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1,6,8,7,9,12,11,10};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
   ///  it apply when the you shoud know the the range
   /// the time complicity o (n)
    public  static  void cycleSort(int[] arr){
       int i = 0;
       while (i < arr.length){
           int correctIndex = arr[i] - 1;

             if(arr[i] != (i+1)){
                 int temp = arr[i];
                 arr[i] = arr[correctIndex];
                 arr[correctIndex] = temp;
             }
             else{
                i++;
             }
       }
    }
}
