class Solution {
    public boolean isValid(String s) {
        Deque<Character> q = new ArrayDeque<Character>();
        
        if(s.length() <= 1) return false;
        for(int i = 0; i < s.length(); i++){
            if(Character.compare(s.charAt(i), '(') == 0 || Character.compare(s.charAt(i), '{') == 0 || Character.compare(s.charAt(i), '[') == 0){
                q.offerFirst(s.charAt(i));
            } else{
                if(q.isEmpty()) return false;
                char rAux = q.poll();
                if(Character.compare(rAux, '(') == 0) if(Character.compare(')', s.charAt(i)) != 0) return false;
                if(Character.compare(rAux, '{') == 0) if(Character.compare('}', s.charAt(i)) != 0) return false;
                if(Character.compare(rAux, '[') == 0) if(Character.compare(']', s.charAt(i)) != 0) return false;
            } 
        }
        if(! q.isEmpty()) return false;

        return true;
    }
}
