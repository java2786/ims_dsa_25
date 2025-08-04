public class Problem {
    public static void main(String[] args) {
        int num = 32145;
        // output = 12543;
        int pos = 0;
        int sum = 0;

        while(num>0){
            int digit = num % 10;
            pos++;
            sum = sum + pos * (int)Math.pow(10,digit-1);
            num = num/10;
        }
        System.out.println(sum);
    }
}
