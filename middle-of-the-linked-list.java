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
    public ListNode middleNode(ListNode head) {
        ListNode aux = head;
        int c = -1;
        int t = 1;
        
        while(aux != null){
            c+=1;
            aux = aux.next;
        }
        
        if(c % 2 != 0) t = 2;
        
        aux = head;
        c = c/2;
        
        for(int i = 0; i <= c ; i++){
            if(t == 1 && i == c) break;
            if(t == 2 && i == c+1) break;
            aux = aux.next;
        }
        
        return aux;
    }
}
