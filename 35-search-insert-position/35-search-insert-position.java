class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int index= lowerBound(nums,target);
        return index;
        
    }
    public int lowerBound(int[] arr, int k){
        int l=0;
        int r= arr.length-1;
        int res= arr.length;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(arr[mid]>=k){
                res=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return res;
    }
}