class Solution {
    
    //brute force
  /* public int missingNumber(int[] nums) {
       
        Arrays.sort(nums);
       
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
                return i;
        }
          return nums.length;    
    }*/
    
    
    //based on math formula summation of n no n*(n+1)/2
   public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int total = n*(n+1) /2;
        int sum =0;
        for(int num:nums)
        {
            sum+=num;
        }
        return total-sum;
              
    }
    //tc : o(n) sc : o(1)
    
    
}