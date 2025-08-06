public class Demo {
    public static void main(String[] args) {
        int count = 5;
            //  5 + 7  - 8 + 8 + 8        
        int a = count++ + ++count - ++count + count + count--;
        System.out.println(a);
        System.out.println(count);
    }
}
