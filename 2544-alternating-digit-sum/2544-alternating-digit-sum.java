class Solution {
    public int alternateDigitSum(int n) {
        if(n<=0) return 0;
        int count=0;
        int no=n;
        while(no>0){
            count++;
            no/=10;
        }
        int sum=0;
        while(n>0){
            int digit=n%10;
            if(count%2==0){ 
                sum-=digit;
                n/=10;
                count--;
            }
            else{
                sum+=digit;
                n/=10;
                count--;
            }
        }
        return sum;
    }
}