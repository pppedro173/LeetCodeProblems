class Solution {
    public int[] plusOne(int[] digits) {
        int aux;
        for(int i = digits.length - 1; i >= 0; i--){
            aux = digits[i] + 1;
            if(aux < 10){
                digits[i] = aux;
                break;
            }
            digits[i] = 0;
            
            if(i == 0 && digits[i] == 0){
                int arr[] = new int[digits.length+1];
                arr[0] = 1;
                for(int j = 1; j < arr.length; j++){
                    arr[j] = digits[j-1];
                }
                return arr;
            }
        }
        return digits;
    }
}
