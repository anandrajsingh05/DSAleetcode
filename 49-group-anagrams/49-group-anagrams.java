class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> res= new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            
            char[] chars= strs[i].toCharArray();
            Arrays.sort(chars);
            
            String mystr= new String(chars);
            if(map.containsKey(mystr)){
                 map.get(mystr).add(strs[i]);
            }
             
            else{
                List<String> bag= new ArrayList<>();
                bag.add(strs[i]);
                map.put(mystr,bag);
            }
            
        }
        
        for(List<String> s : map.values()){
            res.add(s);
        }
        
        return res;
        
    }
    
//     public boolean isAnagram(String s1, String s2){
        
//         if(s1.length() != s2.length()) return false;
        
//         int[] arr= new int[26];
//         for(int i=0; i<s1.length(); i++){
//             arr[s1.charAt(i)-'a']++;
//             arr[s2.charAt(i)-'a']--;
//         }
        
//         for(int a : arr){
//             if(a!=0) return false;
//         }
        
//         return true;
        
//     }
}