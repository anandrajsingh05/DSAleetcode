class Solution {
    public int maxArea(int[] height) {
       int i=0;
        int j=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(i<j){
            int minHeight=0;
             int distance=0;
            int area=0;
            if(height[i]<height[j]){
                minHeight=height[i];
                 distance = j-i;
                area= minHeight*distance;
                if(area>maxArea) maxArea= area;
                i++;
            }
            else {
                 minHeight=height[j];
                 distance = j-i;
                area= minHeight*distance;
                if(area>maxArea) maxArea= area;
                j--;
            }   
        }
        return maxArea;
    }
}