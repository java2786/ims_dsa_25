public class Rec1 {
    static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Rec1 obj = new Rec1();
        obj.display();
    }

    static void display() throws InterruptedException{
        if (count > 10){
            return;
        }
        count++;
        display();
        System.out.println("Hello: "+count);
        // System.out.println("Done");
    }
}
