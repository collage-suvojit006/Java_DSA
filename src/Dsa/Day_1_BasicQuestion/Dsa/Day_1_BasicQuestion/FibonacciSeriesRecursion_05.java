package Dsa.Day_1_BasicQuestion;

public class FibonacciSeriesRecursion_05 {
   ///  mack a memory to store the already calculated fibonacci number
   private  static  long[] fibonaccciCache;

    public static void main(String[] args) {
        int n =70;

        fibonaccciCache = new long[n+1];
        for(int i = 0;i<=n;i++){
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n"+fibonacci(0));

    }


    public  static  long fibonacci(int n){
          if(n<=1){
              return n;
          }
          if(fibonaccciCache[n] != 0){
             return  fibonaccciCache[n];
          }
//
           long nFibonacciNumber = fibonacci(n-1) + fibonacci(n-2);
          fibonaccciCache[n] = nFibonacciNumber;


        return  nFibonacciNumber;
    }
}
