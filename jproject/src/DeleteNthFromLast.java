/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp;
        if(fast==null || fast.next == null){
            return null;
        }
        for(int i=0;i<n+1;i++){
            fast = fast.next;
        }

        // 0 -> 1 -> 2 -> 3 -> 4 -> 5
        // 2nd
        // f5
        // s3
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
}

public class DeleteNthFromLast {
    
}
