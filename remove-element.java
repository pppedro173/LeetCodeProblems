class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        if(nums.length == 1){
            if(nums[0] == val) return 0;
            return 1;
        }
        
        int s = 0;
        int e = nums.length - 1;
        
        
        while(s < e){
            if(nums[s] != val) s++;
            else {
                while(nums[e] == val && e > s){
                    e--;
                }
                nums[s] = nums[e];
                nums[e] = val;
                s++;
            }
        }
        
        if(nums[nums.length - 1] != val) return nums.length;
        
        return e;
    }
}
