class Solution {
    public int trap(int[] height) {
        int max=0;
        int leftArr[] = new int[height.length];
        int rightArr[] = new int[height.length];
        for(int i=0; i<height.length; i++){
            if(height[i]>max) max=height[i];
            leftArr[i]=max;
        }
        
        max=0;
        for(int i=height.length-1; i>=0; i--){
            if(height[i]>max) max=height[i];
            rightArr[i]=max;
        }
        int totalVolume=0;
        for(int i=0; i<height.length; i++){
           int vol= Math.min(rightArr[i],leftArr[i])-height[i];
            totalVolume+=vol;
        }
        
        return totalVolume;
    }
}