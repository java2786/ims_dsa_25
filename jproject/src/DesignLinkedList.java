class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

// Node node = new Node(3);
class MyLinkedList {
    Node start = null;
    int size = 0;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node head = start;
        for(int i=0;i<index;i++){
            head = head.next;
        }
        return head.data;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);

        if(start==null){
            start = node;
        } else {
            Node head = start;
            // head - 5 -> 3 -> 2 -> 
            // newNode 4 -> head
            node.next = head;
            start = node;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);

        if(start==null){
            start = node;
        } else {
            Node head = start;
            // 5 -> 3 -> 2 -> 
            // head - 2 -> 
            while(head.next!=null){
                head = head.next;
            }
            head.next = node;
            
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node head = start;
        if(index<0 || index>size){
            return;
        }

        if(index == 0){
            addAtHead(val);
        }else if(index == size){
            addAtTail(val);
        } else {
            for(int i=0;i<index-1;i++){
                head = head.next;
            }
            Node node = new Node(val);
            node.next = head.next;
            head.next = node;
            size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index >= size || start == null){
            return;
        }
        Node head = start;
        if(index == 0){
            start = start.next;
        } else {
            for(int i=0;i<index-1;i++){
                head = head.next;
            }
            head.next = head.next.next;
        }
        size--;
    }

    public void print(){
        if(start == null){
            System.out.println("[]");
            return;
        }
        Node head = start;

        System.out.print("[");
        while(head!=null){
            System.out.print(head.data+",");
            head = head.next;
        }
        System.out.println("]");
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public class DesignLinkedList {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.print(); // []
        System.out.println(obj.size);

        obj.addAtHead(5);
        obj.addAtHead(4);
        obj.addAtHead(3);
        obj.addAtHead(1);
        obj.addAtTail(7);
        obj.print(); // [1 3 4 5 7]
        System.out.println(obj.size);

        obj.addAtHead(2);
        obj.print(); // [2 1 3 4 5 7]
        System.out.println(obj.size);

        // 2,1,3,4,5,7,
        obj.addAtIndex(2, 6);
        obj.print(); // [2 1 6 3 4 5 7]
        System.out.println(obj.size);

        System.out.println(obj.get(0));

        obj.deleteAtIndex(0);
        obj.print(); // [2 1 6 3 4 5 7]
    }
}
