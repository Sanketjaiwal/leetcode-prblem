class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> RSet = new HashSet<>(); 

        for(int i: nums1){
            set.add(i);
        }
        for(int i: nums2){
            if(set.contains(i)){
                RSet.add(i);
            }
        }
        return RSet.stream().mapToInt(Integer::intValue).toArray();
    }
}