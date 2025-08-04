public class LCM {
    public static void main(String[] args) {
        int a = 18;
        int b = 24;

        int n1 = a<b?a:b;
        int n2 = a>b?a:b;

        while(n1>0){
            int r = n2%n1;
            n2 = n1;
            n1 = r;
        }

        System.out.println("HCF: "+n2);
        System.out.println("LCM: "+(a*b)/n2);

    }
}
