package Day2_Linear_BinaryScrach;

public class CeilingOfChar {

    public static void main(String[] args) {

        char[] arr = {'a' , 'b' , 'c' ,'e'};
        char target = 'd';

        System.out.println(ceilingChar(arr, target));

    }

    public static char ceilingChar(char[] chars, char target) {

        int start  =  0 , end = chars.length -1 ;

//
//
        while (end >= start){
            int mid = start + (end - start) / 2;

            if(target < chars[mid]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }

     return chars[start % chars.length];  // because
    }
}