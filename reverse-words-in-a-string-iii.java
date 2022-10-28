class Solution {
    public String reverseWords(String s) {
        int e = 0;
        int st = 0;
        StringBuilder ss = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            e = s.indexOf(" ", i);

            if(e == -1) e = s.length();

            i = e;
            e = e - 1;
            while(st < e){
                char p = ss.charAt(st);
                ss.setCharAt(st,ss.charAt(e));
                ss.setCharAt(e,p);

                e-=1;
                st +=1;
            }
            st = i + 1;
        }
        return ss.toString();
    }
}
