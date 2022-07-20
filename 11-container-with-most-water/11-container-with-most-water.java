class Solution {
    public int maxArea(int[] height) {
       int i=0;
        int j=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(i<j){
            int minHeight=0;
            int distance=j-i;
            int area=0;
            if(height[i]<height[j]){
                minHeight=height[i];
                i++;
            }
            else {
                minHeight=height[j];
                j--;
            } 
            
            area= minHeight*distance;
            if(area>maxArea) maxArea= area;
            
        }
        return maxArea;
    }
}