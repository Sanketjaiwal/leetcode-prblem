class Solution {
    public int[] singleNumber(int[] nums) {
        
         Map<Integer, Integer> set=new HashMap<>();
        for(int i:nums){
            set.put(i,set.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : set.entrySet()) { 
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}