class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res= new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            int l=i+1;
            int r= nums.length-1;
            while(l<r){
                List<Integer> temp= new ArrayList<>();
                if(nums[i]+nums[l]+nums[r]==0){
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    res.add(temp);
                    l++;
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r]>0) r--;
                else l++;
            }
        }
        
        List<List<Integer>> arr= new ArrayList<>();
        for(List<Integer> ls : res){
            arr.add(ls);
        }
        
        return arr;
    }
}