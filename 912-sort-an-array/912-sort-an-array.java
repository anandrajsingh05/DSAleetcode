class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
       
        return nums;
    }
   public void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int mid= l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    
    public void merge(int[] arr, int l,int mid, int r){
       
        int[] left= new int[mid-l+1];
        int[] right= new int[r-mid];
        int index=0;
        for(int i=l; i<=mid; i++){
            left[index++]=arr[i];
        }
        
        index=0;
        for(int i=mid+1; i<=r; i++){
            right[index++]=arr[i];
        }
       
        index= l; 
        int i= 0;
        int j= 0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[index++]=left[i];
                i++;
            }
            else{
                arr[index++]=right[j];
                j++;
            }
        }
        
        while(i<left.length){
            arr[index++]=left[i];
                i++;
        }
        
        while(j<right.length){
            arr[index++]=right[j];
                j++;
        }
        
    }
    
}