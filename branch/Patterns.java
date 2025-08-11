public class Patterns{
    static void pattern1(int rows, int cr, int cc){
        // base case
        if(cr > rows){
            return;
        }
        // base case 
        if(cr < cc){
            System.out.println();
            pattern1(rows, cr+1, 1);
            return;
        }
        // cr -> stars -> ?
        System.out.print(" *");
        pattern1(rows, cr, cc+1);
    }
    public static void main(String[] args) {
        pattern1(5, 1, 1);
    }
}