class Solution {
    public void moveZeroes(int[] nums) {
        
        ArrayList<Integer> nonZero = new ArrayList<>();
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
        }
        
    }
    
}