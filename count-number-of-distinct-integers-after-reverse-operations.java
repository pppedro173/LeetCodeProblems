class Solution {
    public int countDistinctIntegers(int[] nums) {
        int[] arrNums = new int[(nums.length * 2)];
        Set<Integer> distincts = new HashSet<>();
        int number;
        int remainder = 0;
        int reverse = 0;
        for(int i = 0; i < nums.length; i++){
            number = nums[i];
            while(number != 0)
            {
                remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
            arrNums[i] = nums[i];
            arrNums[nums.length + i] = reverse;
            reverse = 0;
        }
        for (int arrNum : arrNums) {
            distincts.add(arrNum);
        }
        return distincts.size();
    }
}
