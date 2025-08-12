public class RopeCut {
    public static void main(String[] args) {
        int p = cut(7, 2, 3, 5);
        // 223, 232, 322, 25, 52
        System.out.println(p);
    }
// 7, 2-2-3
    static int cut(int len, int a, int b, int c){
        if(len == 0){
            return 1;
        }
        if(len < 0){
            return 0;
        }
        int cutA = cut(len-a, a, b, c);
        int cutB = cut(len-b, a, b, c);
        int cutC = cut(len-c, a, b, c);
        return cutA + cutB + cutC;
    }
}
