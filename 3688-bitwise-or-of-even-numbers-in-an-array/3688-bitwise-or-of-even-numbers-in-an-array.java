class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int xor=0;
        for(int n:nums){
            if(n%2==0) xor|=n;
        }
        return xor;
    }
}