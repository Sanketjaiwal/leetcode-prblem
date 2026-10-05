class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0) return 0;
        int consicative=0,max=0;
        for(int i:nums){
            if(i==1)
                consicative++;
            else
                consicative=0;
            max=Math.max(max,consicative);
        }
       return max; 
    }
}