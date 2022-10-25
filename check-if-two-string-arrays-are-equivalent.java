class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        
        for(int i = 0; i < word1.length || i < word2.length ; i++){
            if(i < word1.length) a.append(word1[i]);
            if(i < word2.length) b.append(word2[i]);
        }
        
        return a.toString().equals(b.toString());
    }
}
