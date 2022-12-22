class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int[] sol = {-1,-1};
        
        while(s <= e){
            int m =  (s + e)/2;
            if(nums[m] == target){
                int aux = m;
                sol[0] = m;
                sol[1] = m;
                if(m > 0){
                    while(aux - 1 >= 0){
                        if(nums[aux - 1] == target){
                            sol[0] = aux-1;
                            aux--;
                        } else break;  
                    } 
                }
                aux = m;
                if(m + 1 < nums.length){
                    while(aux + 1 < nums.length){
                        if(nums[aux + 1] == target){
                            sol[1] = aux + 1;
                            aux++;
                        } else break; 
                    }
                }
                return sol;
            }
            if(nums[m] > target) e = m - 1;
            if(nums[m] < target) s = m + 1;
        }
        return sol; 
    }
}}
