class Solution {
    public String intToRoman(int num) {
        
        StringBuilder result = new StringBuilder();
        
        while(num > 0){
            
            if(num >= 1000){
                num = num - 1000;
                result.append("M");
                continue;
            }

            if(num >= 900){
                num = num - 900;
                result.append("CM");
                continue;
            }

            if(num >= 500){
                num = num - 500;
                result.append("D");
                continue;
            }

            if(num >= 400){
                num = num - 400;
                result.append("CD");
                continue;
            }

            if(num >= 100){
                num = num - 100;
                result.append("C");
                continue;
            }

            if(num >= 90){
                num = num - 90;
                result.append("XC");
                continue;
            }

            if(num >= 50){
                num = num - 50;
                result.append("L");
                continue;
            }

            if(num >= 40){
                num = num - 40;
                result.append("XL");
                continue;
            }

            if(num >= 10){
                num = num - 10;
                result.append("X");
                continue;
            }
            if(num >= 9){
                num = num - 9;
                result.append("IX");
                continue;
            }

            if(num >= 5){
                num = num - 5;
                result.append("V");
                continue;
            }

            if(num >= 4){
                num = num - 4;
                result.append("IV");
                continue;
            }

            if(num >= 1){
                num = num - 1;
                result.append("I");
            }
        }
        
        return result.toString();
    }
}
