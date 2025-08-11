import java.util.Arrays;

public class RevString {
    public void reverseString(char[] s) {
        reverseString(s, 0, s.length);
    }

    public void reverseString(char[] s, int index, int len) {
        // base case
        if(index >= len/2){
            System.out.println("done");
            System.out.println(Arrays.toString(s));
            return;
        }
        // logic
        char temp = s[index];
        s[index] = s[len-1-index];
        s[len-1-index] = temp;

        // small problem
        reverseString(s, index+1, len);

    }

    
    public static void main(String[] args) {
        String str = "Hello";
        RevString rs = new RevString();
        char[] arr = str.toCharArray();
        rs.reverseString(arr);

        System.out.println("In main: "+Arrays.toString(arr));

    }
}