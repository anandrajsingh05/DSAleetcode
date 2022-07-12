class Solution {
    public boolean isHappy(int n) {
       Set<Integer> set= new HashSet<>();
        while(!set.contains(solve(n))){
            int res=solve(n);
            if(res==1)return true;
            else{
                set.add(res);
                n=res;
            }
        }
        return false;
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