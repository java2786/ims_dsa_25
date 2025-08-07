public class RecArr1 {
    static String[] names = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"}; 
    public static void main(String[] args) {
        int num = 312;
        // three one two 
        numberToString(num, "");
    }

    static void numberToString(int num, String result){
        // base case
        if(num == 0){
            System.out.println(result);
            return;
        }

        String name = names[num % 10];
        result = name + result;

        num = num / 10;

        numberToString(num, result);
        // numberToString(num/10, names[num % 10] + " "+ result);
    }
}
