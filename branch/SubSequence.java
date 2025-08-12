public class SubSequence {
    public static void main(String[] args) {
        sub_sequence("ram", "");
    }

    static void sub_sequence(String input, String result){

        // base case
        if(input.length()==0){
            System.out.println("R: "+result);
            return;
        }

        // small problems
        char fc = input.charAt(0);
        // exclude first character
        sub_sequence(input.substring(1), result);
        // include first character
        sub_sequence(input.substring(1), result+fc);
    }
}
