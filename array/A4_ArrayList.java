import java.util.ArrayList;

public class A4_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list.size()); // 0
        list.add(3); // first
        list.add(2);
        list.add(1);
        System.out.println(list.size()); // 3
        System.out.println(list); // 3 2 1
        list.remove(0);
        System.out.println(list.size()); // 2
        System.out.println(list); // 2 1

    }
}
