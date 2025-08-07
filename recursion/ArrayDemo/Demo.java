class Student{

}

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Student()); // class name @ hexadecimal
        System.out.println(new int[3]);
        System.out.println(new String[5]);

        int[] arr1 = new int[10];
        int arr2[] = new int[10];
        int[] arr3 = new int[]{1,2,3};
        int[] arr4 = {1,2,3};

        System.out.println("Lenght: "+arr4.length);
        System.out.println("First: "+arr4[0]);
        System.out.println("Last: "+arr4[arr4.length-1]);

        for(int i=0;i<arr4.length;i++){
            System.out.println(arr4[i]);
        }

        for(int val : arr4){
            System.out.println(val);
        }


    }    

}
