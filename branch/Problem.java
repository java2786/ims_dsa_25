public class Problem {
    public static void main(String[] args) {
        int num = 9785; // 29 - 11 - 2

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            num = sum;
        }
        System.out.println(num);
    }
}
