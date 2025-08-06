public class Rec10_prime {
    public static void main(String[] args) {
        System.out.println(isPrime(12, 2));
    }

    static boolean isPrime(int num, int divisor){
        System.out.println(divisor);
        if(divisor*divisor >= num){
            // prime
            return true;
        }
        if(num%divisor==0){
            // not prime
            return false;
        }
        return isPrime(num, divisor+1);
    }
}
