class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] arr = s.split(" ");
        String ans = arr[arr.length-1];
         
        return ans.length();
      
    }
}