
/*
		H E L L O

		0 1 2 3 4


        BCDA
*/

import java.util.Arrays;

public class ReverseVowel {
    public static void main(String[] args) {
        String str = "hello";
        char[] arr = str.toCharArray();
        int i = 0; // 0
        int j = arr.length-1; // 4
        while(i<j){
            while(i<j && isVowel(arr[i])==false){
                i++;
            }
            while(i<j && isVowel(arr[j])==false){
                j--;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
            
        }
        System.out.println(Arrays.toString(arr));
    }    
    static boolean isVowel(char c){
        // return "aeiouAEIOU".indexOf(c)>=0;
        if(c == 'a' || c == 'e' || c=='i'||c=='o'||c=='u' ||c == 'A' || c == 'E' || c=='I'||c=='O'||c=='U'){
            return true;
        } else {
            return false;
        }
    }
}
