public class Rec11_BtD {
    public static void main(String[] args) {
        int binary = 101;
        binaryToDecimal(binary, 0, 0);
    }


    static void binaryToDecimal(int binary, int index, int output){
        // base case 
        if(binary==0){
            System.out.println(output);
            return;
        }

        int last = binary % 10; 
        binary = binary / 10; 
        output = output + last * (int)Math.pow(2, index); 

        binaryToDecimal(binary, index+1, output);
    }
}
