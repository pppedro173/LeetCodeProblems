class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();
        int j = 0;

        for( int i = 0; i < nums2.length; i++){
            if(s.contains(nums2[i])) continue;
            if(bSearch(nums1, nums2[i])) s.add(nums2[i]);

        }

        int[] r = new int[s.size()];

        for (Integer i: s) {
            r[j++] = i;
        }

        return r;
    }

    public boolean bSearch(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int m;

        Arrays.sort(nums);

        while( s <= e){
            m = (s+e)/2;
            if(nums[m] == target) return true;
            if(nums[m] > target){
                e = m -1;
            } else {
                s = m +1;
            }
        }
        return false;
    }
}
