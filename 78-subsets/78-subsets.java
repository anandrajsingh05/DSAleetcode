class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> bag= new ArrayList<>();
        solve(nums,bag,0);
        
        return res;
    }
    public void solve(int[] arr, List<Integer> bag, int index){
        
        // System.out.println(bag);
        List<Integer> li= new ArrayList<>();
        for(int a : bag){
            li.add(a);
        }
        res.add(li);
        if(index==arr.length) return;
        
        for(int i=index; i<arr.length; i++){
            bag.add(arr[i]);
            solve(arr,bag,i+1);
            bag.remove(bag.size()-1);
        }
        
        
    }
}