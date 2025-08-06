public class Rec8_palindrome {
    public static void main(String[] args) {
        int num = 123;
        int output = reverse(num, 0);
        if(num == output){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    static int reverse(int num, int result){
        // base case
        if(num == 0){
            return result;
        }

        // small problem
        int ld = num % 10;
        result = result * 10 + ld;
        num = num / 10;

        // recursion call
        return reverse(num, result);
    }
}
