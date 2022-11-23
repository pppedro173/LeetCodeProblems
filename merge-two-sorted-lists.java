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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode head = list1.val > list2.val ? list2 : list1;
        ListNode toAdd = list1.val > list2.val ? list1 : list2;

        while(toAdd != null){
            ListNode newNode = new ListNode(toAdd.val);
            head = insert(head, newNode);
            toAdd = toAdd.next;
        }
        
        return head;
    }
    
    public ListNode insert(ListNode head, ListNode e){
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null){
            if(e.val < curr.val){
                prev.next = e;
                e.next = curr;
                return head;
            }            
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = e;
        e.next = null;

        return head;
    }
}
