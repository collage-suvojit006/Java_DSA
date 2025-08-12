package Dsa.Day_1_BasicQuestion;

public class MagicCube_07 {
    public static void main(String[] args) {
     int n = 1;
     int size = 4;
        int[][] arr = new int[size][size];
        int top = 0 , left = 0;
        int button = size-1 , right = size-1;


        while(top <= button && right>= left){

            for(int i = left; i<= right; i++){
                arr[top][i] = n++;
            }
            top++;


            for(int i = top; i<= button ;i ++ ){
                arr[i][button] = n++;
            }
            right--;

            for(int i = right; i>= left; i--){
                arr[button][i] = n++;
            }
            button--;

            for(int i= button; i>=top;i--){
                arr[i][left]= n++;
            }
            left++;
        }

        for(int i = 0 ;i <size;i++){
            for(int j =0 ; j<size ; j++){
               if(arr[i][j] <10) System.out.print("0"+arr[i][j] +" ");
                else  System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
