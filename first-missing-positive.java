class Solution {
    public int firstMissingPositive(int[] nums) {
        int minVal = 1;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 && nums[i] == minVal){
                minVal+=1;
            }
        }
        
        return minVal;
    }
}
