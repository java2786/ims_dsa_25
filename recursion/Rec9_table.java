public class Rec9_table {
    public static void main(String[] args) {
        int num = 5;
        String output = printTable(num, 1, "");
        System.out.println(output);
    }

    static String printTable(int num, int count, String result){
        // base case
        if(count > 10){
            return result;
        }
        // 5 * 1 = 5
        // num * count = num*count
        // System.out.println(num+" * "+count+" = "+(num*count));
        result =result + num+" * "+count+" = "+(num*count) + "\n";
        return printTable(num, count+1, result);
    }
}
