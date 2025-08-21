import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = new int[4];

        // ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(6);
        list.add(12);
        list.add(9);
        // list.add("Demo");
        System.out.println(list);
        System.out.println("Size: "+list.size());

        System.out.println("First: "+list.get(0));
        System.out.println("Last: "+list.get(list.size()-1));

        list.add(2, 5);
        System.out.println(list);

    }
}
