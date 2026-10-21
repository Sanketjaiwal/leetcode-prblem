class Solution {
    public int getSum(int a, int b) {
       while(b!=0){
        int digit=a&b;
        a=a^b;
        b = digit<<1;
       }
        return a;
    }
}