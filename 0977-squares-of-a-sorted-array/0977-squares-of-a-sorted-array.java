class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] nu=new int[nums.length];
        int i=0,j=nums.length-1,k=nums.length-1;
        while(i<=j){
            if((nums[i]*nums[i])>nums[j]*nums[j]){
                nu[k]=nums[i]*nums[i];
                k--;
                i++;
            }
            else{
                nu[k]=nums[j]*nums[j];
                k--;
                j--;
            }
        }
        return nu;
    }
}