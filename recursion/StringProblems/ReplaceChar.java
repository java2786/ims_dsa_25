public class ReplaceChar {

    static String replace(String s, int index, int len, String result){
        // base case
        if(index == len){
            // System.out.println(result);
            return result;
        }
        // logic for current index
        if(s.charAt(index)=='l'){
            // result = result + 'z';
        } else {
            result = result + s.charAt(index);
        }
        // small problem
        return replace(s, index+1, len, result);

    }
    public static void main(String[] args) {
        String s = replace("Hello", 0, 5, "");
        System.out.println(s);
    }
}
