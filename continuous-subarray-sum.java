class Solution {
    
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int s = 0;
        for(int i = 0; i < nums.length; i++){
            s += nums[i];
            if(h.containsKey(s%k)){
                if(i - h.get(s%k) > 1) return true;
            }else{
                 h.put((s%k), i);
            } 
            if(s%k == 0 && i > 0) return true;
        }
        return false;
    }
}
