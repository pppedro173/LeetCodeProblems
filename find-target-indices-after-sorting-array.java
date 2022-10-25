class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        int r;

        Arrays.sort(nums);

        r = bSearch(nums, target);

        if(r == -1) return l;

        l.add(r);

        for(int i = r + 1; i < nums.length; i++){
           if(nums[i] == target){
               l.add(i);
           } else {
               break;
           }
        }
        for(int i = r - 1; i >= 0; i--){
            if(nums[i] == target){
                l.add(i);
            } else {
                break;
            }
        }
        
        Collections.sort(l);
        return l;
    }

    public int bSearch(int[] nums, int target){
        int s = 0;
        int e = nums.length -1;
        int m = 0;
        System.out.println(Arrays.toString(nums));
        while(s <= e){
            m = (s + e)/2;

            if(nums[m] == target) return m;

            if(nums[m] > target){
                e = m-1;
            } else {
                s = m+1;
            }
        }

        return -1;
    }

}
