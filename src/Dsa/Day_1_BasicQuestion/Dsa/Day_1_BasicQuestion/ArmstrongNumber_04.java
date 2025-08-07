package Dsa.Day_1_BasicQuestion;

import java.util.Scanner;

public class ArmstrongNumber_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number : ");
//        int number = sc.nextInt();

        for(int i =0 ;i<=1000;i++){
            armstrongNumber(i);
        }





    }
    public  static  boolean armstrongNumber(int number ){

        int sum=0, lastdigite = 0, temp = number  , count = noOfDigits(number);

        while (temp>0){
            lastdigite = temp % 10 ;
            sum += (int) Math.pow(lastdigite,count);
            temp = temp / 10;
        }
        if(sum== number){
            System.out.println(number + " is a Armstrong Number !!");
            return  true;
        }else {
           // System.out.println(number + " is not a Armstrong Number !!");
            return  false;
        }
    }

    public  static  int noOfDigits(int number){
         int count = 0;

         while(number>0){
             number = number / 10;
             count++;
         }
         return count;
    }
}
