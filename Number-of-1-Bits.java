public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String i = Integer.toBinaryString(n);
        return (int) i.chars().filter(ch -> ch == '1').count();
    }
}
