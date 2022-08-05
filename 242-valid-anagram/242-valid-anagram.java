class Solution {
    public boolean isAnagram(String s, String t) {
        
     //   System.out.println(s.charAt(1) - 'a'); // ascii value of a =97 and n=110 n-a = 110-97=13
        
        int[] alphabet = new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            alphabet[s.charAt(i) - 'a']++ ;
        }
         for(int i=0;i<t.length();i++)
        {
            alphabet[t.charAt(i) - 'a']-- ;
        }
        for(int i:alphabet)
            {
                if(i!=0)
                    return false;
            }
      
        
    return true;
        
    }
}