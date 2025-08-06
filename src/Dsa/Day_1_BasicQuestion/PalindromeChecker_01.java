package Dsa.Day_1_BasicQuestion;

import java.util.Scanner;

public class PalindromeChecker_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String or Number  Palindrome : ");
        String value = scanner.nextLine();

        if(palindromeChecker(value)){
            System.out.println("You Write the corrected Palindrome ");
        }
        else {
            System.out.println("You write the wrong answer ");
        }


    }

    public  static  boolean palindromeChecker(String x){
           ///  formate TheString
             String value = x.replace("+/*-" ,"").toLowerCase().trim();

             String revarce = "";
             ///  revarce the string
             for(int i = value.length()-1;i>=0;i--){
                 revarce += value.charAt(i);
             }

             if(revarce.equals(value)){
                 System.out.println(value + " is a Palindrome Number or String !!");
                 return  true;

             }else {
                 System.out.println(value + " is not a Palindrome Number or String ");

                 return  false;
             }


    }
}
