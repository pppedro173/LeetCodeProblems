class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0 || k % nums.length == 0) return;
        
        int[] aux = new int [nums.length];
        int j = nums.length - 1;
        int rK = k % nums.length;
                
        for(int i = 0; i < nums.length; i++){
            aux[i] = nums[i];
            if(i < rK){                
                nums[i] = nums[j - rK + 1 + i];
            } else {
                nums[i] = aux [i - rK];
            }
        }
    }
}
