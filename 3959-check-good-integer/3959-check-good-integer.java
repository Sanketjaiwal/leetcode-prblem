class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0,sqsum=0;
        int no=n;
        while(no>0){
            int digit=no%10;
            sum+=digit;
            sqsum+=digit*digit;
            no/=10;
        }
        if(sqsum-sum<50){
            return false;
        }
        return true;
    }
}