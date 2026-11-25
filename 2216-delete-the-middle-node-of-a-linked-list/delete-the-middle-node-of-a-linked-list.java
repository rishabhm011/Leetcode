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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head.next == null){
            head = null;
            return head;
        }
        while(fast.next!=null){
            fast = fast.next;
            if(fast.next != null){
                fast= fast.next;
                
            }
            slow= slow.next;
        }
        ListNode temp = head;
        
        while(temp.next != slow && temp.next != null){
            temp = temp.next;
        }
        temp.next = slow.next;
        slow.next = null;
        return head;







    }
}