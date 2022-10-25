class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i;
        Arrays.sort(nums);

        for(i = 0; i < n; i++) if(!bSearch(nums, i)) break;

        return i;
    }

    public boolean bSearch(int[] nums, int target){
        int s = 0;
        int e = nums.length -1;
        int m = 0;

        while(s <= e){
            m = (s + e)/2;

            if(nums[m] == target) return true;

            if(nums[m] > target){
                e = m-1;
            } else {
                s = m+1;
            }
        }

        return false;
    }
}
