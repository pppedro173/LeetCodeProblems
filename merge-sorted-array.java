class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {        
        for(int i = 0; i < n; i++){
            int val = nums2[i];
            for(int j = 0; j < n + m; j++){
                if(nums1[j] > val){
                    int temp = nums1[j];
                    nums1[j] = val;
                    int l = j+1;
                    while(l < m + i){
                        int temp2 = nums1[l];
                        nums1[l] = temp;
                        temp = temp2;
                        l++;
                    }
                    nums1[l] = temp;
                    break;
                }
                if(j == (m + i)){
                    nums1[j] = val;
                    i++;
                    for(; i < n; i++){
                        nums1[m + i] = nums2[i];
                    }
                    return;
                } 
            }
        }
    }
