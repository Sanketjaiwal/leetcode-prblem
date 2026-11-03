class Solution {
    public int minMoves(int[] nums) {
        if(nums==null|| nums.length<=1) return 0;
        Arrays.sort(nums);
        int total=0;
        for(int i=0;i<nums.length-1;i++){
            total+=nums[nums.length-1]-nums[i];
        }
        return total;
    }
}