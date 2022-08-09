class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0; i<ransomNote.length(); i++){
            Integer count=map.get(ransomNote.charAt(i));
            map.put(ransomNote.charAt(i), count !=null ? count+1 : 1);
        }
        
        for(int i=0; i<magazine.length(); i++){
            Integer count=map.get(magazine.charAt(i));
            if(count !=null && count>0){
                map.put(magazine.charAt(i), count-1);
            }
        }
        System.out.println(map);
        for(int a : map.values()){
            if(a!=0) return false;
        }
        
        
        return true;
        
    }
}