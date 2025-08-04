public class HCF {
    public static void main(String[] args) {
        // int a = 32;
        // int b = 48;

        // int hcf = 1; // 1
        // int small = a<b?a:b; // 18
        // for(int i=1;i<=small;i++){ // 4
        //     if(a%i==0 && b%i==0){
        //         hcf = i; // 3
        //     }
        //     System.out.println("I: "+i+", HCF: "+hcf);
        // }

        int a = 18;
        int b = 24;

        int n1 = a<b?a:b;
        int n2 = a>b?a:b;

        while(n1>0){
            int r = n2%n1;
            n2 = n1;
            n1 = r;
        }
        System.out.println(n2);

    }
}
