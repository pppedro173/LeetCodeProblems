class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0;
        int e = 1;

        while(e < nums.length){
            if(nums[s] != nums[e]){
                s+=1;
                nums[s] = nums[e];
            }
            e+=1;
        }
        
        s+=1;
        return s;
    }
}
