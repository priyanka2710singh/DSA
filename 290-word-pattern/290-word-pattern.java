class Solution {
    public boolean wordPattern(String pattern, String s) {
        
       String words[] = s.split(" ");
        
        if(words.length != pattern.length())
            return false;
        
        // a dog      dog true
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Boolean> map2 = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            
            if(map1.containsKey(ch) == false)
            {
                 if(map2.containsKey(words[i]) == true) 
                    return false; 
              
                else
                {
                    map1.put(ch, words[i]);
                    map2.put(words[i],true);
                }
                
            }
            else
            {
                String mapWith = map1.get(ch);
                
                if(mapWith.equals(words[i]) == false) return false;
            }
        }
        return true;
        
        
    }
}