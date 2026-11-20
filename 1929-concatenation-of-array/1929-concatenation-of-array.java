class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] num=new int[n+n];
        int index=0;
        for(int i=0;i<n;i++){
            num[index++]=nums[i];
        }
        for(int i=0;i<n;i++){
            num[index++]=nums[i];
        }
        return num;
    }
}