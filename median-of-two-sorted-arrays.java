class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        
        if(arr.length % 2 != 0) return (double) arr[arr.length / 2];
        
        return (double) ((arr[(arr.length - 1) / 2]) + (arr[arr.length / 2])) / 2;
    }
}
