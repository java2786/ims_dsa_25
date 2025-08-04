public class SwapFirstLast{
    public static void main(String[] args) {
        int num = 12345;

        // find last digit
        int lastDigit = num % 10; // 5
        num = num / 10; // 1234
        int copy = num; // 1234
        // count digits
        int count = 0;

        while(num>0){
            num = num / 10; // 0
            count++; // 4
        }
        num = copy; // 1234

        int div = (int) Math.pow(10, count-1);

        int first = num / div; // 1
        int mid = num % div; // 234

        // 50000 + 2340 + 1
        int r = lastDigit*(int)Math.pow(10, count) +  mid*10 + first;
        System.out.println(r);



    }
}