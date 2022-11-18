class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length - 1;
        int area = 0;
        
        while(s < e){
            area = Math.max(area, (e-s) * Math.min(height[s],height[e]));
            
            if(height[s] < height[e]){
                s +=1;
            } else {
                e -=1;
            }
        }
        
        return area;
    }
}
