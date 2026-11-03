class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int total=0;
        int mid=nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            total += Math.abs(nums[i] - nums[mid]);
        }
        return total;
    }
}