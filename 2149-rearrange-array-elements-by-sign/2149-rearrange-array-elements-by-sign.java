class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int possitive=0,negative=1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
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