class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length==1) return true;
        int no=nums[nums.length/2];
        int first=-1,last=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==no){
                if(first==-1)
                first=i;
                last=i;
            }
        }
        if(first!=last) return false;
        return true;
    }
}