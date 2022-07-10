class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map= new HashMap<>();
         Map<Character,Character> map2= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!= t.charAt(i) ||                          map2.containsKey(t.charAt(i)) && map2.get(t.charAt(i))!= s.charAt(i)){
               return false;
            }
            else{
                map.put(s.charAt(i),t.charAt(i));
                map2.put(t.charAt(i),s.charAt(i));
            } 
        }
        return true;
       
    }
}