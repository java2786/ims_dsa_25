public class Rec4_PrintNum {
    public static void main(String[] args) {
        printNum(12345);
    }

    static void printNum(int n){
        // base case
        if(n == 0){
            return;
        }
        // rec
        printNum(n/10);

        // small problem
        System.out.println(n%10);
    }
}
