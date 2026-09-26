import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int largest=999999,count=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            if(count==k)break;
            if(nums[i]<=largest){
                largest=nums[i];
                count++;
            }
        }
        return largest;
    }
}