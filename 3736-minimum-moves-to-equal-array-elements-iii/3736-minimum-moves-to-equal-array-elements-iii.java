class Solution {
    public int minMoves(int[] nums) {
        if(nums==null|| nums.length<=1) return 0;
        Arrays.sort(nums);
        int total=0;
        for (int i = 0; i < nums.length; i++) {
            total += Math.abs(nums[i] - nums[nums.length-1]);
        }
        return total;
    }
}