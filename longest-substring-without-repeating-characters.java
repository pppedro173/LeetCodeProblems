class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int j = 0, i= 0, max = 0;

        while(j < s.length()){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }else{
                set.add(s.charAt(j));
                max = Math.max(max, set.size());
                j++;
            }
        }
        return max;
    }
}
