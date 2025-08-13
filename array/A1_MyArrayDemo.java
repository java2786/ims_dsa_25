import java.util.Arrays;

class MyArray{
    int[] array = null;
    int size = 0;
    public MyArray(int capacity){
        array = new int[capacity];
    }
    public int size(){
        return size;
    }
    public void add(int val){
        if(size>=5){
            System.out.println("MyArray is full");
            // throw new RuntimeException("MyArray is full");
            return;
        }
        array[size] = val;
        size++;
    }
    public void remove(){
        if(size<=0){
            System.out.println("MyArray is empty");
            // throw new RuntimeException("MyArray is empty");
            return;
        }

        size--;
    }
    public void remove(int index){
        if(size<=0){
            System.out.println("MyArray is empty");
            // throw new RuntimeException("MyArray is empty");
            return;
        }
        for(int i=index+1;i<size;i++){
            array[i-1] = array[i];
        }
        size--;
    }
    public void read(){
        // System.out.println(Arrays.toString(array));
        String output = "[";
        for(int i=0;i<size;i++){
            output = output + array[i] + ", ";
        }
        output = output + "]";
        System.out.println(output);
    }
}
public class A1_MyArrayDemo {
    public static void main(String[] args) {
        MyArray myArr = new MyArray(5);
        System.out.println(myArr.size()); // 0
        myArr.read();
        myArr.remove();// empty
        myArr.add(5);
        myArr.add(4);
        myArr.add(3);
        myArr.add(2);
        myArr.add(1);
        myArr.add(6);// full
        myArr.read();
        myArr.remove();// last - size 4
        myArr.read(); 
        System.out.println(myArr.size());
    }
}
