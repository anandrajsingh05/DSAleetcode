class Solution {
    public int addDigits(int num) {
       int res=num/10;
        if(res==0)return num;
        return addDigits(sum(num));
    }
    public int sum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}