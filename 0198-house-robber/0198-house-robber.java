class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int a=0,b=0;
        for(int i:nums){
            int current=Math.max(a,b+i);
            b=a;
            a=current;
        }
        return a;
    }
}