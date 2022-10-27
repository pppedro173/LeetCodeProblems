class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;
        while(s < e){
            if(numbers[s] + numbers[e] == target){
                break;
            }
            
            if(numbers[s] + numbers[e] > target){
                e = e - 1;
            } else{
                s = s + 1;
            }
            
            
        }
        
        int[] res = {s + 1,e + 1};
        return res;
    }
}
