class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null|| nums.length==0) return 0;
        int pro=1,max=nums[0],min=nums[0],gmax=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(nums[i],max*nums[i]);
            min=Math.min(nums[i],min*nums[i]);

            gmax=Math.max(gmax,max);
        }
        return gmax;
    }
}