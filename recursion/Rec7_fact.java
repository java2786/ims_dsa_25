public class Rec7_fact {
    public static void main(String[] args) {
        System.out.println(getFactorial(4));
    }

    static int getFactorial(int n){
        // base case
        if(n == 0 || n==1){
            return 1;
        } 
        return n * getFactorial(n-1);
    }
}
