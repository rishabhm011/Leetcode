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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for(int i = 0 ; i <= k - 2 ; i++){
            first = first.next;
        }
        ListNode temp = head;
        int count = 1;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        ListNode sec = head;
        
        for(int j = 0 ; j < count - k ; j++){
            sec = sec.next;
        }
        int tempo = first.val;
        first.val = sec.val;
        sec.val = tempo;
        return head;
    }
}