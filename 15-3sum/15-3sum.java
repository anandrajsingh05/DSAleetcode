class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
             if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r= nums.length-1;
            while(l<r){
                List<Integer> temp= new ArrayList<>();
               
                if(nums[i]+nums[l]+nums[r]>0) r--;
                else if(nums[i]+nums[l]+nums[r]<0) l++;
                else {
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    res.add(temp);
                    l++;
                   while(nums[l]==nums[l-1] && l<r) l++;
                } 
            } 
        }
        
        return res;
    }
}