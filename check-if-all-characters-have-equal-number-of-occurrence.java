class Solution {
    public  boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        int aux;
        int i;

        for(i = 0; i < s.length(); i++){
            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), 0);
            }else{
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            }
        }
        aux = m.get(s.charAt(0));
        for (Map.Entry<Character, Integer> set :
                m.entrySet()) {

           if(set.getValue() != aux) return false;
        }
        return true;
    }
}
