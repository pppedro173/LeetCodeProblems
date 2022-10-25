class Solution {
    public int searchInsert(int[] nums, int target) {
        int s  = 0;
        int e = nums.length - 1;
        int m = 0;
        
        while( s <= e){
            m = (s+e)/2;
            if(nums[m] ==  target) return m;

            if(nums[m] > target){
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return s;
    }
}
