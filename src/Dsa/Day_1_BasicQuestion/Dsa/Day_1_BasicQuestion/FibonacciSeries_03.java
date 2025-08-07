package Dsa.Day_1_BasicQuestion;

import java.util.Scanner;

public class FibonacciSeries_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of trem :");
        int n = sc.nextInt();

        int a=0 , b = 1 , result;

        for(int i =1;i<=n;i++){
            System.out.print(a +" ");
            result = a+b;
            a= b;
            b= result;
        }
    }
}
