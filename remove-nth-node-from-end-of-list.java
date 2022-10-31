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
        ListNode aux = head;
        ListNode prev = null;
        int size = 0;
        int count = 0;
        
        while(aux != null){
            prev = aux;           
            aux = aux.next;
            size+=1;
        }
        
        aux = head;
        
        if(size - n == 0){
            return aux.next;
        }
            
        while(count < size - n){
            prev = aux;
            aux = aux.next;
            count+=1;
        }
        
        prev.next = aux.next;
        
        return head;
    }
}
