class Solution {
    public int mirrorDistance(int n) {
        int result=0;
        int no=n;
        while(no>0){
            int digit=no%10;
            no/=10;
            result=(result*10)+digit;
        }
        return Math.abs(n-result);
    }
}