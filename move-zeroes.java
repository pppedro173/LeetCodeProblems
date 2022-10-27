class Solution {
    public void moveZeroes(int[] nums) {
        int c = nums.length;
        int d = 0;
        
        for( int i = 0; i < c; i++){
            if(nums[i] != 0){
                nums[d] = nums[i];
                d++;
            }
        }
        
        for(int i = d; i < c; i++){
            nums[i] = 0;
        } 
    }
}
