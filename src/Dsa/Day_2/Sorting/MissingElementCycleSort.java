package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementCycleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
       cycleSort(arr);
        System.out.println(Arrays.toString(arr));
//        List<Integer> list = answer(arr);
//        for(int x : list){
//            System.out.print(x + " ");
//        }

    }

    public static List<Integer> answer(int[] arr) {
        cycleSort(arr);
        List<Integer>  mylsit = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == (i+1))) {
                mylsit.add(i+1);
            }
        }
        return mylsit;
    }


    private static void cycleSort(int[] arr) {
        int i = 0;

        while (arr.length > i) {
           int correct = arr[i]-1;
            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;

            }
        }

    }
}