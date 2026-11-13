class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(min>i) min=i;
            if(max<i) max=i;
            set.add(i);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i))
            list.add(i);

        }
        return list;
    }
}