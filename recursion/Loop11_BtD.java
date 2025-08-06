public class Loop11_BtD {
    public static void main(String[] args) {
        int binary = 100;
        // output = 4
        int output = 0;
        int index = 0;

        // int last = binary % 10; // 0
        // binary = binary / 10; // 10
        // output = output + last * (int)Math.pow(2, index); // 0
        // index++; // 1

        // last = binary % 10; // 0
        // binary = binary / 10; // 1
        // output = output + last * (int)Math.pow(2, index); // 0
        // index++; // 2

        // last = binary % 10; // 1
        // binary = binary / 10; // 0
        // output = output + last * (int)Math.pow(2, index); // 4
        // index++; // 3


        while(binary>0){
            int last = binary % 10; 
            binary = binary / 10; 
            output = output + last * (int)Math.pow(2, index); 
            index++; // 1
        }
        System.out.println(output);
    }
}
