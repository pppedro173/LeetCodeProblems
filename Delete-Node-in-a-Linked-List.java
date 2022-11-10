class Solution {
    public void deleteNode(ListNode node) {

        while(true){
            if(node.next.next == null){
                node.val = node.next.val;
                node.next = null;
                break;
            } 
            node.val = node.next.val;
            node = node.next;
        }
    }
}
