class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int low=0,high=nums.length-1,mid=low+(high-low+1)/2;
        for(int i=0;i<mid;i++){
            sum-=nums[i];
        }
        for(int i=mid;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}