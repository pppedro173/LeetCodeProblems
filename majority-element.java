class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        int count = 1;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums [i-1]){
                count++;
                if(count == (nums.length/2)){
                    return nums[i];
                }
            } else {
                count = 0;
            }
        }
        
        return -1;
    }
}
