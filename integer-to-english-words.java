class Solution {
    
    private static final HashMap<Integer, String> nums = new HashMap<>();

    static {
        nums.put(1, "One");
        nums.put(2, "Two");
        nums.put(3, "Three");
        nums.put(4, "Four");
        nums.put(5, "Five");
        nums.put(6, "Six");
        nums.put(7, "Seven");
        nums.put(8, "Eight");
        nums.put(9, "Nine");
        nums.put(10, "Ten");
        nums.put(11, "Eleven");
        nums.put(12, "Twelve");
        nums.put(13, "Thirteen");
        nums.put(14, "Fourteen");
        nums.put(15, "Fifteen");
        nums.put(16, "Sixteen");
        nums.put(17, "Seventeen");
        nums.put(18, "Eighteen");
        nums.put(19, "Nineteen");
        nums.put(20, "Twenty");
        nums.put(30, "Thirty");
        nums.put(40, "Forty");
        nums.put(50, "Fifty");
        nums.put(60, "Sixty");
        nums.put(70, "Seventy");
        nums.put(80, "Eighty");
        nums.put(90, "Ninety");
    }

    public static StringBuilder result;

    public String numberToWords(int num) {
        
        result = new StringBuilder("");
        
        if(num == 0) {
            return "Zero";
        }
        
        while (num > 0) {

            if (num >= 1_000_000_000) {
                num = getBillions(num);
                continue;
            }

            if (num >= 1_000_000) {
                num = getMillions(num);
                continue;
            }

            if(num >= 1000){
                num = getThousands(num);
                continue;
            }

            if(num >= 100){
                num = getHundreds(num);
                continue;
            }

            if(num >= 0){
                num = getUnits(num);
            }
        }
        
        return result.toString().trim().replaceAll(" +", " ");
    }
    
    private static int getBillions(int num){
        int counter = 0;

        while (num >= 1_000_000_000){
            num = num - 1_000_000_000;
            counter++;
        }

        Solution.result.append(nums.get(counter));
        Solution.result.append(" Billion ");

        return num;
    }

    private static int getMillions(int num){
        int aux = 0;
        int millionNum = num / 1_000_000;

        if(millionNum >= 100){
            aux =getHundreds(millionNum);
            if(aux > 0){
                aux = getUnits(aux);
            }
        } else{
            aux = getUnits(millionNum);
        }

        Solution.result.append(" Million ");

        num = num - (millionNum * 1_000_000);

        return num;
    }

    private static int getThousands(int num){
        int aux = 0;
        int thousandNum = num / 1_000;

        if(thousandNum >= 100){
            aux =getHundreds(thousandNum);
            if(aux > 0){
                aux = getUnits(aux);
            }
        } else{
            aux = getUnits(thousandNum);
        }

        Solution.result.append(" Thousand ");

        num = num - (thousandNum * 1000);

        return num;
    }

    private static int getHundreds(int num){
        int counter = 0;

        while (num >= 100){
            num = num - 100;
            counter++;
        }
        Solution.result.append(nums.get(counter));
        Solution.result.append(" Hundred ");

        return num;
    }

    private static int getUnits(int num){
        int counter = 0;
        int aux = 0;

        if(num < 20){
            while(num > 0){
                num--;
                counter++;
            }
            Solution.result.append(nums.get(counter));
        } else {
            aux = (num / 10) * 10;
            num = num % 10;
            Solution.result.append(nums.get(aux));

            if(num > 0) {
                while(num > 0){
                    num--;
                    counter++;
                }
                Solution.result.append(" ");
                Solution.result.append(nums.get(counter));
            }
        }

        return num;
    }
    
    
}
