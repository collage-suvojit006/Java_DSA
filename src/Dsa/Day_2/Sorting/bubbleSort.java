package Sorting;

import java.util.Arrays;

public class bubbleSort {


    public static void main(String[] args) {


        int[] arr = {2,4,1,5,65,3};
        bubbleSortAlgo(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSortAlgo(int[] arr ){


        for(int i = 0 ; i<arr.length-1 ; i++){
            boolean flag = true;
            for(int j = 0 ; j< arr.length - 1 -i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }

        }

    }
}
