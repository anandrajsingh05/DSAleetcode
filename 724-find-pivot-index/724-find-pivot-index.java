class Solution {
    
    public int leftSum(int[] arr, int index){
        int sum=0;
        for(int i=index-1; i>=0; i--){
            sum+=arr[i];
        }
        return sum;
    }
    public int rightSum(int[] arr, int index){
        int sum=0;
        for(int i=index+1; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    
    public int pivotIndex(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            int left=leftSum(nums,i);
            int right=rightSum(nums,i);
            
            if(left==right)return i;
            
        }
        
        return -1;
        
    }
}