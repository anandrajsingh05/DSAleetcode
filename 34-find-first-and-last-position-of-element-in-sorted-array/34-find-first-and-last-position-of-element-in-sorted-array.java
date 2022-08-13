class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low= lowerBound(nums,target);
        int high= upperBound(nums,target);
        return new int[]{low,high};
    }
    
    public int lowerBound(int[] nums, int target){
        int l=0;
        int r= nums.length-1;
        int res= -1;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(nums[mid]==target){
                res=mid;
                r=mid-1;
            }
            else if(nums[mid]>target) r= mid-1;
            else l=mid+1;
        }
        return res;
    }
    
    public int upperBound(int[] nums, int target){
        int l=0;
        int r= nums.length-1;
        int res= -1;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(nums[mid]==target){
                res=mid;
                l=mid+1;
            }
            else if(nums[mid]>target) r= mid-1;
            else l=mid+1;
        }
        return res;
    }
}