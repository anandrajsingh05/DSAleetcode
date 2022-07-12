class Solution {
    public boolean isHappy(int n) {
        String str= Integer.toString(n);
        System.out.println(n);
        if(str.length()==1 && n==1)return true;
        else if(str.length()==1 && n==4)return false;
        return isHappy(solve(n));
    }
    
    public int solve(int n){
        
        String str= Integer.toString(n);
        int[] arr= new int[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i]=str.charAt(i)-'0';
        }
       int sum=0;
        for(int a: arr){
            sum+=a*a;
        }
        return sum;
    }
}