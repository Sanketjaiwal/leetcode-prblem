class Solution {
    public int maxProduct(int n) {
        int first=0,second=0;
        while(n>0){
            int no=n%10;
            if(no>first){
                second=first;
                first=no;
            }
            else if(no>second)
            second=no;
            n/=10;
        }
        return first*second;        
    }
}