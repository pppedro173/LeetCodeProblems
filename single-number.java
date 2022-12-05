class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> l = new ArrayList();
        
        for(int i = 0; i < nums.length; i++){
            if(l.contains(nums[i])){
              l.remove(l.lastIndexOf(nums[i]));  
            } else {
                l.add(nums[i]);
            }
        }
        
        return l.remove(0);
    }
}
