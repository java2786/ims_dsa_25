import java.util.Arrays;

public class Rec6_oddEvenCount {
    public static void main(String[] args) {
        // e, o
        int[] finalArr = countOddEven(123, new int[]{0,0});
        System.out.println(Arrays.toString(finalArr));
    }

    public static int[] countOddEven(int n, int[] arr){
        // base case
        if(n == 0){
            // System.out.println(Arrays.toString(arr));
            return arr;
        }
        // rec
        //  - consume last digit
        if(n%2==0){
            arr[0] = arr[0] + 1;
        } else {
            arr[1] = arr[1] + 1;
        }

        // small problem
        return countOddEven(n/10, arr);
    }
}
