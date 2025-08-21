class MyNode{
    int data;
    MyNode next;
    MyNode(int data){
        this.data = data;
    }
}
public class MyNodeDemo {
    public static void main(String[] args) {
        MyNode n1 = new MyNode(1);
        MyNode n2 = new MyNode(2);
        MyNode n3 = new MyNode(3);
        MyNode n4 = new MyNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
}
