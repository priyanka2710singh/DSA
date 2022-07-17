class Solution {
    public void moveZeroes(int[] nums) {
        
        //brute force
      /*  ArrayList<Integer> nonZero = new ArrayList<>();
        ArrayList<Integer> Zero = new ArrayList<>();
        int i=0;
        for(int n : nums)
        {
            if(n==0)
                Zero.add(n);
            else
                nonZero.add(n);
        }
        for(int num:nonZero)
        {
            nums[i++]= num;
        }
        for(int num : Zero)
        {
            nums[i++]=num;
        }*/
        
        
        //optimized
        if(nums.length ==0 || nums ==  null)
            return; 
        
        int insertPos=0;
        for(int num : nums)
        {
            if(num !=0)
                nums[insertPos++] = num;

        }
        while(insertPos<nums.length)
        {
            nums[insertPos++] = 0;
        }
        
    }
    
}