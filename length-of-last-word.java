class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        int st = s.lastIndexOf(" ");
        if(st == -1 ) return len;
        st++;
        return (len - st);
    }
}
