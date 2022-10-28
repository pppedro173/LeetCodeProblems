class Solution {
    public void reverseString(char[] s) {
        int st = 0;
        int e = s.length - 1;
        
        while(st < e){
            char p = s[st];
            s[st] = s[e];
            s[e] = p;            
            st +=1;
            e -=1;
        }
    }
}
