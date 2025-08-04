public class Rotate {
    public static void main(String[] args) {
        int num = 12345;
        int r = 2;

        int div = (int)Math.pow(10, r); // 100
        int left = num / div; // 123
        int copy = left;
        int right = num % div; // 45

        int leftCount = 0;

        while(left>0){
            left = left/10;  // 12
            leftCount++;
        }
        left = copy; // 123

        int result = right * (int)Math.pow(10, leftCount) + left;
        System.out.println(result);

    }
}
