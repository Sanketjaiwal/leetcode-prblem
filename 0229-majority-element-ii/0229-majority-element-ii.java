class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        if(nums==null||nums.length==0) return list; 

        Map<Integer, Integer> set=new HashMap<>();
        for(int i:nums){
            set.put(i,set.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry:set.entrySet()){
            if(entry.getValue()>(nums.length/3)){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}