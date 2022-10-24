class Solution {
    public int reverse(int x) {
        if(x >= 1_000_000_000 && (x%1_000_000_00) < 10 && (x%1_000_000_00) > 0) return 0;
        if(x <= -1_000_000_000 && (x%1_000_000_00) > -10 && (x%1_000_000_00) < 0) return 0;
        int n;
        boolean signal = false;
        if(x < 0){
            signal =true;
            x = x*-1;
        }
        StringBuilder s = new StringBuilder();
        while(x >= 10){
            n = x%10;
            x = x/10;
            s.append(Integer.toString(n));
        }
        s.append(Integer.toString(x));
        n =Integer.parseInt(s.toString());
        if(signal) n = n * (-1);

        return n;
    }
}
