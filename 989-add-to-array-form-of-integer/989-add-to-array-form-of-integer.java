class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int m= Integer.toString(k).length();
        int n= num.length;
        int[] arr = new int[m];
        int i=m-1;
        while(k>0){
            arr[i]= k%10;
            k/=10;
            i--;
        }
        
        List<Integer> list= new ArrayList<>();
        int f=n-1;
        int s=m-1;
        int carry=0;
        while(f>=0 || s>=0 || carry>0){
            int sum=0;
            if(f>=0) sum+= num[f];
            if(s>=0) sum+= arr[s];
            sum+=carry;
            carry=sum/10;
            list.add(sum%10);
            f--;
            s--;
        }
        Collections.reverse(list);
        return list;
    }
}