class Solution {
    public int[] rearrangeArray(int[] nums) {
        int possitive=0,negative=1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr[possitive]=nums[i];
                possitive+=2;
            }
            else{
                arr[negative]=nums[i];
                negative+=2;
            }
        }
        return arr;
    }
}