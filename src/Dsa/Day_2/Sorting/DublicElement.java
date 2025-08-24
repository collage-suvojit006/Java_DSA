package Sorting;

public class DublicElement {

    public static void main(String[] args) {

        int[] arr = {1,4,5,3,3};
        int result = dublicElement(arr);
        System.out.println(result);

    }

    public  static  int dublicElement(int[] arr ){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != (i+1)){
                if(arr[i] != arr[correct]){
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }

        return  -1;
    }
}
