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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            if(prev != null){
                while(prev.val == curr.val){
                    curr = curr.next;
                    prev.next = curr;
                    if(curr == null){
                        prev.next = null;
                        break;
                    }
                }           
            } 
            
            prev = curr;
            if(curr != null) curr = curr.next;
        }
        
        return head;
    }
}
