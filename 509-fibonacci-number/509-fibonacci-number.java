class Solution {
    public int fib(int n) {
        
        int[] arr= new int[31];
        
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<=n; i++){
            arr[i]= arr[i-1]+arr[i-2];
        }
        
        return arr[n];
    }
}