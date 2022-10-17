class Solution {
    
    private static final HashMap<String, Integer> romanNums = new HashMap<>();

    static {
        romanNums.put("I", 1);
        romanNums.put("V", 5);
        romanNums.put("X", 10);
        romanNums.put("L", 50);
        romanNums.put("C", 100);
        romanNums.put("D", 500);
        romanNums.put("M", 1000);
    }
    
    
    public int romanToInt(String s) 
    {
        String romanNumber = "";
        int numberA = 0;
        int numberB = 0;
        int result = 0;

        romanNumber = s.substring(0,1);
        numberA = romanNums.get(romanNumber);
        result = numberA;

        for(int i = 1; i < s.length(); i++){
            romanNumber = s.substring(i,i+1);
            numberB = romanNums.get(romanNumber);

            if(numberA < numberB){
                result = result + numberB - (2 * numberA);
            } else{
                result = result + numberB;
            }

            numberA = numberB;
        }
        
        return result;
    }
}
