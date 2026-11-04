class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        if(nums==null|| n<=1) return 0;
        Arrays.sort(nums);
        int total=0;
        for(int i=0;i<n-1;i++){
            total+=nums[n-1]-nums[i];
        }
        return total;
    }
}