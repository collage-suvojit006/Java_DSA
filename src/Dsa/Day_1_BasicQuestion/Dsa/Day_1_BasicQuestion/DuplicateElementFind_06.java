package Dsa.Day_1_BasicQuestion;

import java.util.Scanner;

public class DuplicateElementFind_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();

        char arr[] = name.toLowerCase().toCharArray();

        for(int i = 0 ; i< arr.length; i++){
            int count = 1;
            if(arr[i] == '0') continue;

            for(int j = 1+i; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    arr[j] = '0';
                    count++;
                }
            }

            if(count>1){
                System.out.println(arr[i] + " → " + count + " times");
            }
        }


    }
}
