class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int num:nums) total+=num;

        int left_sum=0;
        for(int i=0;i<nums.length;i++){
            int right_sum=total-left_sum-nums[i];
            if(right_sum==left_sum) return i;
            left_sum+=nums[i];
        }
        return -1;
    }
}