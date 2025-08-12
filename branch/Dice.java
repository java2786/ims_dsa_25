public class Dice {
    public static void main(String[] args) {
        int c = play(4);
        /*
        1 1 1 1
        1 1 2
        1 3
        1 2 1
        2 2
        3 1
        2 1 1
        4
        */
        System.out.println(c);
    }

    static int play(int num){
        if(num < 0){
            return 0;
        }
        if(num == 0){
            return 1;
        }

        int ways = 0;
        for(int i=1;i<=6;i++){
            ways = ways + play(num-i);
        }
        return ways;
    }
    
}
