public class RecArr2 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        findElement(array, 40, 0);
    }

    static void findElement(int[] arr, int element, int index){
        if(index == arr.length){
            System.out.println("Not found");
            return;
        }
        if(arr[index]==element){
            System.out.println("found at "+index);
            return;
        }

        findElement(arr, element, index+1);
    }
}
