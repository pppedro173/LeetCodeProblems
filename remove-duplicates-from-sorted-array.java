class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0 , e = 1, k = 1;

        while(e < nums.length){
            if(nums[s] == nums[e]){
                e+=1;
            } else {
                nums[s + 1] = nums[e];
                s+=1;
                e+=1;
                k+=1;
            }
        }
        return k;
    }
}
