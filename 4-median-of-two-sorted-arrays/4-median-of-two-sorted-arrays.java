class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int n=nums1.length+nums2.length;
        int index=0;
        int[] arr = new int[n];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[index]=nums1[i];
                i++;
                index++;
            }
            else{
                arr[index]=nums2[j];
                j++;
                index++;
            } 
        }
        while(i<nums1.length){
            arr[index]=nums1[i];
            i++;
            index++;
        }
        while(j<nums2.length){
            arr[index]=nums2[j];
            j++;
            index++;
        }
        // for(int a: arr){
        //     System.out.print(a+" ");
        // }
        double res=0;
        if(n%2==1) res= (double)arr[n/2];
        else res= (double)(arr[n/2]+arr[(n-1)/2])/2;
        return res;
    }
}