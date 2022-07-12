class Solution {
    public boolean isHappy(int n) {
        String str= Integer.toString(n);
        System.out.println(n);
        if(str.length()==1 && n==1)return true;
        else if(str.length()==1 && n==4)return false;
        return isHappy(solve(n));
    }
    
    public int solve(int n){
      
        int sum=0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
      return sum;
    }
}