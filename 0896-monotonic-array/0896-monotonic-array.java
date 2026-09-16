class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        int i=0,j=1;
        if(n>1){
            while(nums[i]==nums[j]){
                i++;
                j++;
                if(j>=n) return true;
            }
            if(nums[i]<nums[j]){
                for(int k=j;k<n-1;k++){
                    if(nums[k]>nums[k+1]){
                        return false;
                    }
                }
            }else if(nums[i]>nums[j]){
                for(int k=j;k<n-1;k++){
                    if(nums[k]<nums[k+1]){
                        return false;
                    }
                }
            }
            
        }
        return true;
    }
}