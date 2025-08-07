public class Replace {
    public static void main(String[] args) {
        String str = "Hello";
        char find = 'l';
        char change = 'z';
        replace(str, 0, find, change, "");
    }
    static void replace(String input, int index, char find, char change, String result){

        if(index == input.length()){
            System.out.println(result);
            return;
        }
        if(input.charAt(index)==find){
            result = result + change;
        } else {
            result = result + input.charAt(index);
        }
        replace(input, index+1, find, change, result);
    }
}
