package Dsa.Day_1_BasicQuestion;

import java.util.Scanner;


public class MaxMinElementArray_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


     //// without sort the array Complixity : O(n)

      int min = arr[0];
      int max = arr[0];

       for(int i = 0;i<arr.length ; i++){
           if(arr[i]  < min ){
                min = arr[i];
           }
           if(arr[i] > max ){
               max = arr[i];
           }
       }
        System.out.println("Minimum Element : " + min);
        System.out.println("Maximum Element :" + max);




//        /// sort the arr method 1 Complixity : O(n2)
//        for(int i = 0 ;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i] >= arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("Minimum Element : "+arr[0]);
//        System.out.println("Maxmium Element : " + arr[arr.length-1]);
        sc.close();
    }
}
