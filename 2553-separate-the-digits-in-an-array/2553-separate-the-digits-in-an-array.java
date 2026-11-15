class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int n=nums[i];
            while(n>0){
                list.add(0,n%10);
                n/=10;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}