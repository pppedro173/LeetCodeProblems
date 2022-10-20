class Solution {
    public int findMaxK(int[] nums) {
        List<Integer> negs = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        int aux = -1;
        int res = -1;

        for (int num : nums) {
            if (num < 0) {
                negs.add(num);
            } else {
                pos.add(num);
            }
        }

        while(!negs.isEmpty()){
            aux = Collections.min(negs);
            negs.remove((Integer) aux);
            if(pos.contains(aux * -1)){
                res = aux * -1;
                break;
            }
        }
        return res;
    }           
}
