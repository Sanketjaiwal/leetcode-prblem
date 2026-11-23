class Solution {
    public int missingNumber(int[] nums) {
        // int result=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     result^=i;
        //     result^=nums[i];
        // }
        // return result;
        int n=nums.length;
        int expectedsum=n*(n+1)/2;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return expectedsum-sum;
    }
}