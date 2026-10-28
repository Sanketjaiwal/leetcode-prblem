class Solution {
    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
        }
        int xor=0;
        for(int no:nums){
            xor^=no;
        }
        return xor;        
    }
}