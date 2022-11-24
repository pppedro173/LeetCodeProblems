class Solution {  
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList();
        if(nums.length < 3) return l;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i+1;
            int w = nums.length -1;
            while(j < w){
                int val1 = nums[i];
                int val2 = nums[j];
                int val3 = nums[w];
                int sum = val1 + val2 + val3;
                if(sum == 0){                        
                    int num1 = Math.min(val1,Math.min(val2,val3));
                    int num3 = Math.max(val1,Math.max(val2,val3));
                    int num2 = (val1 + val2 + val3) - (num1 + num3);
                    List<Integer> r = new ArrayList();
                    r.add(num1);
                    r.add(num2);
                    r.add(num3);
                    if(!l.contains(r)){
                        l.add(r);
                    }
                    j++;
                    w--;
                }                 
                else if (sum >0) w--;
                else if (sum<0) j++;
            }
        }
        return l;  
    }
}
