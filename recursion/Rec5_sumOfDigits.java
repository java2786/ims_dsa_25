public class Rec5_sumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        sumDigits(12345,sum);
        System.out.println("Main: "+sum);
    }
    static void sumDigits(int n, int sum){
        // base case
        if(n == 0){
            // System.out.println("Sum: "+sum);
            return;
        }
        // rec
        // small problem - consume last digit
        sumDigits(n/10, sum + n%10);
    }
}
