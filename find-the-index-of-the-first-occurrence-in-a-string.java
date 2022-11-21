class Solution {
    public int strStr(String haystack, String needle) {
        int s = 0;
        int e = needle.length();
        
        while(e <= haystack.length()){
            if(haystack.substring(s,e).equals(needle)) return s;
            s+=1;
            e+=1;
        }
        
        return-1;
    }
}
