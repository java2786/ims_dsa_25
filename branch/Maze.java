public class Maze {
    public static void main(String[] args) {
        play(1, 1, 3, 3, "");
    }
// 1, 2, 3, 4, 
    static void play(int cr, int cc, int rows, int cols, String result){
        if(cr>rows || cc > cols){
            return;
        }
        if(cr==rows && cc==cols){
            // end piece
            System.out.println(result);
            return;
        }

        play(cr, cc+1, rows, cols, result+"R");
        play(cr+1, cc, rows, cols, result+"D");
    }
}
