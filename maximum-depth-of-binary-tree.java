class Solution {
    public int maxDepth(TreeNode root) {
        int height = 0; 
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode aux;
        int nNodes = 1;
        int incNodes = 0;
        q.add(root);
        while(q.peek() != null){
            for(int i = 0; i < nNodes; i++){
                aux = q.poll();
                incNodes--;
                if(aux == null) break;
                if(aux.left != null){
                    incNodes++;
                    q.add(aux.left);
                }
                if(aux.right != null){
                    incNodes++;
                    q.add(aux.right);
                }
            }
            height++;
            nNodes = nNodes + incNodes;
            incNodes = 0;
        }
        return height;  
    }
}
