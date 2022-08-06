class Solution {
    public int fib(int n) {
        
        if(n==0 || n==1) return n;
        int first=0;
        int second=1;
        int third=0;
        for(int i=2; i<=n; i++){
            third= first+ second;
            first=second;
            second=third;
        }
        
        return third;
    }
}