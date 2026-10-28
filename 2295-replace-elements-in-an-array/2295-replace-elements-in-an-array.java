class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
         Map<Integer, Integer> set=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            set.put(nums[i],i);
        }
        for(int[] op: operations){
            int orignal=op[0];
            int replace=op[1];
            int index=set.get(orignal);
            nums[index]=replace;
            set.remove(orignal);
            set.put(replace,index);
        }
        return nums;
    }
}