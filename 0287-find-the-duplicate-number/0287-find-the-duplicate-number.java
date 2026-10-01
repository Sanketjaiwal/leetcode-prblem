class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(true){
            if(nums[i]!=i){
                if(nums[nums[i]]!=nums[i]){
                    int temp=nums[nums[i]];
                    nums[nums[i]]=nums[i];
                    nums[i]=temp;
                }
                else
                {
                    return(nums[i]);
                }
            }
        }
        
    }
}