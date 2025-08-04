public class Rec3_PrintName{
    public static void main(String ...arg){
        printName(5);
    }

    static void printName(int n){

        // base case / termination case
        if(n==0){
            return;
        }
        System.out.println("Arun");
        // small problem
        printName(n-1);
        System.out.println(n);
    }
}