class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashSet<Integer> container= new HashSet<>();
        List<Integer> result= new ArrayList<>();
        for(int i: nums){
            if(!container.add(i)){
                result.add(i);
            }
        }
        return result;
    }
}