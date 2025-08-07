import java.util.Arrays;

public class Rec3Occurrance {
    public static void main(String[] args) {
        int[] array = {30,30,130,230,30,30 };
        int[] result = findOccurrance(array, 0, 0, 30);
        System.out.println(Arrays.toString(result));
    }
    static int[] findOccurrance(int[] arr, int index, int count, int element){
        if(index == arr.length){
            System.out.println(count);
            return new int[count];
        }
        if(element == arr[index]){
            count = count + 1;
        }
        int[] output = findOccurrance(arr, index+1, count, element);
        // fall down
        if(element == arr[index]){
            output[count-1] = index;
        }
        return output;
    }
}
