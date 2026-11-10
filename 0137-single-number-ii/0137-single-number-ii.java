class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> set=new HashMap<>();
        for(int i:nums){
            set.put(i,set.getOrDefault(i,0)+1);
        }
         for (Map.Entry<Integer, Integer> entry : set.entrySet()) { 
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}