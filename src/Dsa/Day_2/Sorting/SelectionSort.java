package Sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {

        int[] arr = {1,2,-34,0,32};
       /// selectionSortMaxElement(arr);

        selectionSortMinElement(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSortMaxElement(int[] arr){
        for(int i = 0 ; i< arr.length ; i ++){
            int last = arr.length -1 -i;

            int maxIndex = getMaxIndex(arr, 0 , last);

            swap(arr, maxIndex ,last);

        }
}
public   static  void swap(int[] arr , int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]  = temp;
}

private  static  int getMaxIndex(int[] arr, int start , int end){
            int max = start;

            for(int i = start; i <= end ; i++){
                if(arr[max] < arr[i]){
                    max = i;
                }
            }


            return  max;
    }


    public static void selectionSortMinElement(int[] arr){

             for(int i = 0 ; i< arr.length  ; i++){
                 int min_index = i;

                 for(int j = i+1; j<arr.length;j++){
                     if (arr[min_index]> arr[j]){
                         min_index = j;
                     }
                 }

                 swap(arr ,i , min_index);
             }
    }
}



