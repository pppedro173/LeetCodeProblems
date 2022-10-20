class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        int i = 0;
        int reverse = 0;
        int number;
        int remainder = 0;
        int sum = 0;
        if(num == 0) return true;
        while(i < num){
            number = i;
            while(number != 0){
                remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
            sum = i + reverse;
            if(sum == num) return true;
            i++;
            reverse = 0;
        }

        return false;
    }
}
