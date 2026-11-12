class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0,j=nums.length-1,count=0;
        while(i<j){
            if(nums[j]==0)
            j--;
            else if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                count++;
                i++;
                j--;
            }
            else
            i++;
        }
        return count;
    }
}