public class Rec2 {
    public static void main(String[] args) {
        Rec2 obj = new Rec2();
        obj.display(1);
    }

    void display(int count){
        if (count > 5){
            return;
        }
        System.out.println("Hello: "+count);
        count++;
        display(count);
        System.out.println("Done:"+count);
    }
}
