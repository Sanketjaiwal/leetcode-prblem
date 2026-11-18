class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        long sum=0;
        long x=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int d=c-'0';
            sum+=d;
            if(d>0){
                x=x*10+d;
            }
        }
        return x*sum;
    }
}