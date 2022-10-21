class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(Math.abs(i - j) > k) break;
                if(nums[i] != nums[j]) continue; 
                return true;
            }
        }
        return false;
    }
}
