import java.util.Arrays;

public class A2_ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int i = 0;
        int j = arr.length - 1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        //
        System.out.println(Arrays.toString(arr)); // 5 4 3 2 1 
    }
}
