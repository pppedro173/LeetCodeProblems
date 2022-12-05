/**
xor idea
0^a = a
a^b
a^b^a = (a^a)^b = 0^b
In this way only the number which is unique (lets say b) remains till the end.
**/

class Solution {
    public int singleNumber(int[] nums) {
        int r = 0;
        for (int n : nums) r ^= n;
        return r;
    }
}
