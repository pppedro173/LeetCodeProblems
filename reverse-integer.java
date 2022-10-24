class Solution {
 public static int reverse(int x) {
        if(x == -2147483648) return 0;
        int n;
        boolean signal = false;
        if(x < 0){
            signal =true;
            x = Math.abs(x);
            System.out.println(x);
        }
        StringBuilder s = new StringBuilder();
        while(x >= 10){
            n = x%10;
            x = x/10;
            s.append(Integer.toString(n));
        }
        s.append(Integer.toString(x));

        try {
            n =Integer.parseInt(s.toString());
        }
        catch(Exception e) {
            return 0;
        }

        if(signal) n = n * (-1);

        return n;
    }
}
