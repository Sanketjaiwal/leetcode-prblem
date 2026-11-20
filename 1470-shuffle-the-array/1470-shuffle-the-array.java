class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] num=new int[nums.length];
        int index=0;
        for(int i=0;i<n;i++){
            num[index++]=nums[i];
            num[index++]=nums[i+n];
        }
        return num;
    }
}