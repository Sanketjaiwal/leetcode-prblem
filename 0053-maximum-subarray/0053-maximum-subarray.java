class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int sum=0,max=nums[0];
        for(int i:nums){
            sum+=i;
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
}