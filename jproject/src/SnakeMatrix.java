class Student{}
public class SnakeMatrix {
    public static void main(String[] args) {
        int mat[][] =new int[][]{{10, 20, 30, 40},
         {15, 25, 35, 45},
         {27, 29, 37, 48},
         {32, 33, 39, 50}};

         // Output: 10 20 30 40 45 35 25 15 27 29 37 48 50 39 33 32 

         boolean flag = true;

         for(int row=0;row<mat.length;row++){
            int[] arr = mat[row];

            if(flag==true){
                for(int col=0;col<arr.length;col++){
                    System.out.print(arr[col]+ " ");
                }
            } else {
                for(int col=arr.length-1;col>=0;col--){
                    System.out.print(arr[col]+ " ");
                }
            }
            flag = !flag;
         }
    }
}
