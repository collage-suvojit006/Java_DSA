package Dsa.Day_1_BasicQuestion;
import java.util.Scanner;
public class RevaeseStringorNumber_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String  value = sc.nextLine();

        String revarsed = "";

        for(int i = value.length()-1; i>=0; i--){
            revarsed += value.charAt(i);
        }

        System.out.println("Original String : " + value);
        System.out.println("Reversed String : " + revarsed);
    }
}
