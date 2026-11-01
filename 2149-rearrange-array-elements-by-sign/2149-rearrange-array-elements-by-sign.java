class Solution {
    public int[] rearrangeArray(int[] nums) {
        int possitive=0,negative=1;
        int[] arr=new int[nums.length];
        for(int i:nums){
            if(i>=0){
                arr[possitive]=i;
                possitive+=2;
            }
            else{
                arr[negative]=i;
                negative+=2;
            }
        }
        return arr;
    }
}