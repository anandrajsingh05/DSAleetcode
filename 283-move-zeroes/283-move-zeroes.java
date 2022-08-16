class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i] !=0) {
                i++;
                j++;
            }
            else{
                
                 while(j<nums.length && nums[j]==0) j++;
                if(j<nums.length && nums[i]==0){
                    swap(nums,i,j);
                    i++;
                    j++;
                }
            }
              
        }
    }
    
    public void swap(int[] nums, int a, int b){
        int temp= nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}