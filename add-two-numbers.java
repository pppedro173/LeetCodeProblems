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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int car = 0;
        ListNode head = null;
        ListNode prev = null;
        
        while(l1 != null || l2 != null || car != 0){
            int res = car;
            if(l1 != null) res = res + l1.val;
            if(l2 != null) res = res + l2.val;
            
            if(res >= 10){
                int st = res;
                res = res % 10;
                car = st/10;
            } else {
                car = 0;
            }
            
            ListNode node = new ListNode(res);
            if(prev != null){
                prev.next = node;
                prev = node;
            } else {
                head = node;
                prev = head;
            }
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        return head;
    }
}
