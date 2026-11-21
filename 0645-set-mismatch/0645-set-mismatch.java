class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] result=new boolean[nums.length];
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            if(result[nums[i]-1]) ans[0]=nums[i];
            else result[nums[i]-1]=true;
        }
        for(int i=0;i<nums.length;i++){
            if(!result[i]) ans[1]=i+1;;
        }
        return ans;
    }
}