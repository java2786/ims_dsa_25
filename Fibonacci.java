public class Fibonacci {
    public static void main(String[] args) {
        int prev = 0; // 2
        int next = 1; // 3

        int num = 8;
        for(int i=0;i<num;i++){
            System.out.println(prev);

            int sum = prev + next; // 3
            prev = next;
            next = sum;
        }
    }
}
