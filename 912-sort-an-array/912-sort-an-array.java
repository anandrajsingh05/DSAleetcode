class Solution {
    public int[] sortArray(int[] nums) {
        int low= 0;
        int high=nums.length-1;
        quickSort(nums,low,high);
        return nums;
    }
    public void quickSort(int[] arr, int low, int high){
        
        if(low<high){
            int part=partition(arr,low,high);
            quickSort(arr,low,part-1);
            quickSort(arr,part+1,high);
        }
    
    }
    
    public int partition(int[] arr, int low, int high){
       
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i] <= pivot && i<high) i++;
            while(arr[j] > pivot && j>low) j--;
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        
        return j;
        
    }
    
    public void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    
}