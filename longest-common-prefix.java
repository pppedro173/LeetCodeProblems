class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lPrefix = strs[0];
        String aux = "";
        int j;
        for(int i = 0; i < strs.length - 1; i++){
            j = 0;
            while(j < lPrefix.length() && j < strs[i+1].length()){
                if(lPrefix.charAt(j) == strs[i+1].charAt(j)){
                    aux = aux + lPrefix.charAt(j);
                } else{
                    break;
                }
                j++;
            }
            lPrefix = aux;
            aux ="";
        }
        return lPrefix;
    }
}
