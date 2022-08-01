class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int l=0;
        int r=0;
        while(l<nums1.length && r<nums2.length){
            
            if(nums1[l]==nums2[r]){
                list.add(nums1[l]);
                l++;
                r++;
            }
            else if(nums1[l]<nums2[r]) l++;
            else r++;
            
        }
        
        // System.out.println(list);
        
        int[] arr= new int[list.size()];
        int index=0;
        for(int a: list){
            arr[index]=a;
            index++;
        }
        
        return arr;
       
    }
}