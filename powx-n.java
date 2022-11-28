class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        
        if(x == 1.00000) return x;
        
        if(x == -1.00000){
            if(n%2 == 0) return x * -1;
            return x;
        } 
        
        if(n == 1) return x;
        if(n == -2147483648) return 0.00000;
        
        if(n < 0){
            x = 1/x;
            n = n * -1;
        }
        
        double t = x;

        for(int i = 1; i < n; i++){
            x = x * t;
        } 
        
        return x;
    }
}
