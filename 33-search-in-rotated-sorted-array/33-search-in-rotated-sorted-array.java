class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length==1 && nums[0]==target) return 0;
       else if(nums.length==1 && nums[0]!=target) return -1;
        int pivot= pivot(nums);
        // System.out.println(pivot);
        int left=binSearch(nums,target,0,pivot);
        int right=binSearch(nums,target,pivot+1,nums.length-1);
        // System.out.println(left+" "+right);
        int res=Math.max(left,right);
        return res;
       
        
    }
    
    public int pivot(int[] arr){
        
        int l=0;
        int r= arr.length-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(mid !=arr.length-1 && arr[mid]>arr[mid+1]) return mid;
            else if(arr[0]>arr[mid]){
                r=mid-1;
                
            }
            else l=mid+1;
        }
       return -1;
    }
    
    
    
    
    public int binSearch(int[] arr, int k, int l, int r){
       
        while(l<=r){
            int mid= l+(r-l)/2;
            if(arr[mid]==k) return mid;
            else if(arr[mid]>k){
                r=mid-1;
            }
            else l=mid+1;
        }
       return -1;
    }
}