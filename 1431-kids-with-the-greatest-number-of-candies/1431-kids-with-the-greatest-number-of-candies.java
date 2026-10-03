class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mx=0;
        for(int a:candies){
            mx=Math.max(mx,a);
        }
        List<Boolean> result=new ArrayList<>();
        for(int a:candies){
            result.add((a+extraCandies)>=mx);
        }
        return result;   
    }
}