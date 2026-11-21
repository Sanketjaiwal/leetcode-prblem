class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int len=nums.length;
        for(int i=1;i<=len;i++){
            int n=Math.abs(nums[i-1]);
            if(nums[n-1]>0)
            nums[n-1]=-nums[n-1];
        }
        for(int i=1;i<=len;i++){
            if(nums[i-1]>0) list.add(i);
        }
        
        return list;
    }
}