import java.util.ArrayList;
import java.util.Collections;

public class A5_LeaderNums {
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        int leader = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>leader){
                leader = arr[i];
                // list.addFirst(leader);
                // list.add(0, leader);
                list.add(leader);
            }
        }
        Collections.sort(list);
        System.out.println(list);// [17 5 2]
    }
}
