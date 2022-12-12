class Solution {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int fn1 = 1;
        int fn2 = 2;
        int fn = 0;
        
        for(int i = 3; i <= n; i++){
            fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
        }
        
        return fn2;
    }
}
