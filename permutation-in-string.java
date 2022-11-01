class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length() > s2.length()) return false;

        int size = s1.length();
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> s2Map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            if(s1Map.containsKey(s1.charAt(i))){
                s1Map.put(s1.charAt(i), s1Map.get(s1.charAt(i)) + 1);
            } else {
                s1Map.put(s1.charAt(i), 1);
            }
            if(s2Map.containsKey(s2.charAt(i))){
                s2Map.put(s2.charAt(i), s2Map.get(s2.charAt(i)) + 1);
            } else {
                s2Map.put(s2.charAt(i), 1);
            }
        }

        int j = size;
        for(int i = 0; j < s2.length(); i++){
            if(s1Map.equals(s2Map)) return true;

            if(s2Map.containsKey(s2.charAt(j))){
                s2Map.put(s2.charAt(j), s2Map.get(s2.charAt(j)) + 1);
            } else {
                s2Map.put(s2.charAt(j), 1);
            }

            if(s2Map.get(s2.charAt(i)) > 1){
                s2Map.put(s2.charAt(i), s2Map.get(s2.charAt(i)) - 1);
            }
             else {
                s2Map.remove(s2.charAt(i));
            }
             j++;
        }
        return s1Map.equals(s2Map);
    }
}
